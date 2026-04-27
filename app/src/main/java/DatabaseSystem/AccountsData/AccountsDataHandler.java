package DatabaseSystem.AccountsData;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import ConsoleSystem.Console;
import DatabaseSystem.Database;
import MainSystem.Managers.ManagerLogin;

public class AccountsDataHandler {
    
    public static void refreshData() throws SQLException {
        List<AccountsDataTable> accounts = Database.queryForList("SELECT * FROM accounts", AccountsDataTable::new);
        
        if (ManagerLogin.isLoggedIn()) {
            for (AccountsDataTable data : accounts) {
                if (ManagerLogin.getAccountLoggedIn().idEquals(data.id())) {
                    ManagerLogin.updateAccountLoggedIn(data);
                    break;
                }
            }
        }
        
        // FIX #5: Only create the default account once. If the table is still empty after
        // the insert, something is wrong with the DB — do NOT recurse again.
        if (accounts.isEmpty()) {
            Console.out("No accounts found, inserting default account");
            
            AccountsDataTable defaultAccount = new AccountsDataTable(
                null, "SuperAdmin", 1, "SuperAdmin", "", "", 1, java.sql.Date.valueOf(LocalDate.now())
            );
            
            insertData(defaultAccount, "SuperAdmin".toCharArray());
            
            // Re-fetch once to sync the session — no second recursive call.
            List<AccountsDataTable> afterInsert = Database.queryForList("SELECT * FROM accounts", AccountsDataTable::new);
            if (ManagerLogin.isLoggedIn() && !afterInsert.isEmpty()) {
                for (AccountsDataTable data : afterInsert) {
                    if (ManagerLogin.getAccountLoggedIn().idEquals(data.id())) {
                        ManagerLogin.updateAccountLoggedIn(data);
                        break;
                    }
                }
            }
        }
    }
    
    // FIX #7: Removed the unused `refresh` boolean parameter that was never read.
    // All callers should simply call getAllData() now.
    public static AccountsDataTable[] getAllData() throws SQLException {
        List<AccountsDataTable> freshDataList = Database.queryForList("SELECT * FROM accounts", AccountsDataTable::new);
        
        // FIX #5 (continued): If the table is empty, attempt to create the default account
        // exactly once — no self-recursive call.
        if (freshDataList.isEmpty()) {
            refreshData();
            freshDataList = Database.queryForList("SELECT * FROM accounts", AccountsDataTable::new);
        }
        
        return freshDataList.toArray(AccountsDataTable[]::new);
    }
    
// Find ======================================================================================================
    
    public static AccountsDataTable findDataById(int id) throws SQLException {
        return Database.queryForObject("SELECT * FROM accounts WHERE id = ?", AccountsDataTable::new, id).orElse(null);
    }
    
    public static AccountsDataTable findDataByUserId(int userId) throws SQLException {
        return Database.queryForObject("SELECT * FROM accounts WHERE userID = ?", AccountsDataTable::new, userId).orElse(null);
    }
    
    public static AccountsDataTable findDataByUsername(String username) throws SQLException {
        return Database.queryForObject("SELECT * FROM accounts WHERE username = ?", AccountsDataTable::new, username).orElse(null);
    }
    
// Check Duplicate ===========================================================================================
    
    public static boolean checkDuplicateUserId(int oldUserId, int newUserId) {
        if (oldUserId == newUserId) return false;
        try {
            return findDataByUserId(newUserId) != null;
        } catch (SQLException e) {
            Console.errorOut("Check duplicate userId error", e);
        }
        return true;
    }
    
    public static boolean checkDuplicateUsername(String oldUsername, String newUsername) {
        if (oldUsername.equals(newUsername)) return false;
        try {
            return findDataByUsername(newUsername) != null;
        } catch (SQLException e) {
            Console.errorOut("Check duplicate username error", e);
        }
        return true;
    }
    
// ===========================================================================================================
    
    // FIX #8: The char[] password is zeroed out in a finally block after use so it
    // does not linger in memory longer than necessary.
    public static AccountsDataTable loginAccount(String usernameOrId, char[] charPassword) throws SQLException {
        try {
            AccountsDataTable account = null;

            // Safely check if the input is entirely numeric using Regex
            if (usernameOrId.matches("\\d+")) {
                account = findDataByUserId(Integer.parseInt(usernameOrId));
            }

            // If it wasn't an ID, or the ID wasn't found, try treating it as a username
            if (account == null) {
                account = findDataByUsername(usernameOrId);
            }

            // If no account is found at all, return null
            if (account == null) return null;

            // Hash the inputted password USING the account's unique salt
            String hashedInput = hashPassword(charPassword, account.salt());

            if (account.checkPassword(hashedInput)) return account;

            return null;
        } finally {
            // FIX #8: Always wipe the raw password from memory once we are done with it.
            Arrays.fill(charPassword, '\0');
        }
    }

    // FIX #8: Same clearing treatment for the standalone verify helper.
    public static boolean verifyLogin(AccountsDataTable data, char[] password) {
        try {
            return data.checkPassword(hashPassword(password, data.salt()));
        } finally {
            Arrays.fill(password, '\0');
        }
    }
    
// Security Methods ==========================================================================================
    
    // Generates a random 16-byte string to use as the salt
    public static String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }

    // FIX #4: hashPassword no longer returns null on failure.
    // NoSuchAlgorithmException and InvalidKeySpecException mean PBKDF2WithHmacSHA256
    // is unavailable in this JVM — that is a fatal environment problem, not something
    // the caller can recover from, so we throw an unchecked exception instead of
    // silently returning null and storing a null hash in the database.
    public static String hashPassword(char[] password, String salt) {
        try {
            KeySpec spec = new PBEKeySpec(password, Base64.getDecoder().decode(salt), 65536, 256);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            byte[] hash = factory.generateSecret(spec).getEncoded();
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            // Wrap in RuntimeException — this JVM does not support PBKDF2WithHmacSHA256,
            // which should never happen on any modern Java 8+ runtime.
            throw new RuntimeException("PBKDF2WithHmacSHA256 is not available in this JVM", e);
        }
    }
    
// CRUD ======================================================================================================
    
    public static void deleteData(int id) {
        try {
            Database.executePrepared("DELETE FROM accounts WHERE id = ?", id);
            refreshData(); // Synchronize cache
        } catch (SQLException e) {
            Console.errorOut("Deleting data from table accounts error", e);
        }
    }
    
    public static void insertData(AccountsDataTable data, char[] rawPassword) {
        // Generate a fresh salt for the new user
        String newSalt = generateSalt();
        String hashedPassword = hashPassword(rawPassword, newSalt);

        String insertAccountSql = "INSERT INTO accounts (name, userID, username, password, salt, role, lastChange) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String insertSettingsSql = "INSERT INTO settings (accountId, autoLogoutTime, preferredDate) VALUES (?, '120', '1')";
        
        try {
            Database.executeTransaction(conn -> {
                try (PreparedStatement accStmt = conn.prepareStatement(insertAccountSql, Statement.RETURN_GENERATED_KEYS)) {
                    accStmt.setString(1, data.name());
                    accStmt.setInt(2, data.userId());
                    accStmt.setString(3, data.username());
                    accStmt.setString(4, hashedPassword); // Save the secure hash
                    accStmt.setString(5, newSalt);        // Save the unique salt
                    accStmt.setInt(6, data.role());
                    accStmt.setDate(7, data.lastChange());
                    accStmt.executeUpdate();
                    
                    try (ResultSet generatedKeys = accStmt.getGeneratedKeys()) {
                        if (generatedKeys.next()) {
                            int newAccountId = generatedKeys.getInt(1);
                            try (PreparedStatement setStmt = conn.prepareStatement(insertSettingsSql)) {
                                setStmt.setInt(1, newAccountId);
                                setStmt.executeUpdate();
                            }
                        }
                    }
                }
                return null; // Signals successful execution inside lambda
            });
        } catch (SQLException e) {
            Console.errorOut("Inserting data from table accounts error", e);
        }
    }

    public static void updatePassword(char[] rawPassword, int id) {
        try {
            // If they change their password, give them a fresh salt too!
            String newSalt = generateSalt();
            String hashedPassword = hashPassword(rawPassword, newSalt);

            String query = "UPDATE accounts SET password = ?, salt = ?, lastChange = ? WHERE id = ?";
            Database.executePrepared(query, 
                hashedPassword, newSalt, java.sql.Date.valueOf(LocalDate.now()), id
            );
        } catch (SQLException e) {
            Console.errorOut("Updating password data error", e);
        }
    }
    
    public static void updateData(AccountsDataTable data, int id) {
        try {
            // Removed password and salt from this query to prevent accidental corruption
            String query = "UPDATE accounts SET name = ?, userId = ?, username = ?, role = ?, lastChange = ? WHERE id = ?";
            Database.executePrepared(query, 
                data.name(), data.userId(), data.username(), 
                data.role(), data.lastChange(), id
            );
        } catch (SQLException e) {
            Console.errorOut("Updating data from table accounts error", e);
        }
    }
}