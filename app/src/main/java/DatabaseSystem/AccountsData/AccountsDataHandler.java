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
import java.util.Base64;
import java.util.List;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import ConsoleSystem.Console;
import ConsoleSystem.ConsoleColors;
import DatabaseSystem.Database;
import MainSystem.Main;
import MainSystem.Managers.ManagerLogin;

public class AccountsDataHandler {
    
    public static void refreshData() throws SQLException {
        List<AccountsDataTable> accounts = Database.queryForList("SELECT * FROM accounts", AccountsDataTable::new);
        
        if (ManagerLogin.isLoggedIn()) {
            for (AccountsDataTable data : accounts) {
                if (ManagerLogin.getAccountLoggedIn().idEquals(data.getId())) {
                    ManagerLogin.updateAccountLoggedIn(data);
                    break;
                }
            }
        }
        
        if (accounts.isEmpty()) {
            Console.out("No accounts found, inserting default account");
            
            AccountsDataTable defaultAccount = new AccountsDataTable(
                null, "SuperAdmin", 1, "SuperAdmin", "", "", 1, java.sql.Date.valueOf(LocalDate.now())
            );
            
            insertData(defaultAccount, "SuperAdmin".toCharArray());
            
            refreshData(); // Re-run to update the session if necessary
            return;
        }
        // -------------------------------
        
        if (Main.debugDataHandlerRefresh) Console.out("AccountsDataHandler synced with DB", ConsoleColors.YELLOW);
    }
    
    public static AccountsDataTable[] getAllData(boolean refresh) throws SQLException {
        List<AccountsDataTable> freshDataList = Database.queryForList("SELECT * FROM accounts", AccountsDataTable::new);
        freshDataList.removeIf(AccountsDataTable::isError);
        
        // If the table is completely empty, trigger our default account creation logic
        if (freshDataList.isEmpty()) {
            refreshData();
            // Call this method again now that the default account is inserted
            return getAllData(false); 
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
    
    public static AccountsDataTable loginAccount(String usernameOrId, char[] charPassword) throws SQLException {
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
        String hashedInput = hashPassword(charPassword, account.getSalt());
        
        if (account.checkPassword(hashedInput)) return account;
        
        return null;
    }

    public static boolean verifyLogin(AccountsDataTable data, char[] password) {
        return data.checkPassword(hashPassword(password, data.getSalt()));
    }
    
// Security Methods ==========================================================================================
    
    // Generates a random 16-byte string to use as the salt
    public static String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }

    // Hashes the password using PBKDF2 and the unique salt
    public static String hashPassword(char[] password, String salt) {
        try {
            // 65536 iterations slows down hackers significantly
            KeySpec spec = new PBEKeySpec(password, Base64.getDecoder().decode(salt), 65536, 256);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            byte[] hash = factory.generateSecret(spec).getEncoded();
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            Console.errorOut("Password Hashing Error", e);
            return null;
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
                    accStmt.setString(1, data.getName());
                    accStmt.setInt(2, data.getUserId());
                    accStmt.setString(3, data.getUsername());
                    accStmt.setString(4, hashedPassword); // Save the secure hash
                    accStmt.setString(5, newSalt);        // Save the unique salt
                    accStmt.setInt(6, data.getRole());
                    accStmt.setDate(7, data.getLastChange());
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
                data.getName(), data.getUserId(), data.getUsername(), 
                data.getRole(), data.getLastChange(), id
            );
        } catch (SQLException e) {
            Console.errorOut("Updating data from table accounts error", e);
        }
    }
}