package DatabaseSystem.AccountsData;

import ConsoleSystem.Console;
import DatabaseSystem.Database;
import MainSystem.Managers.ManagerLogin;
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
        
        if (accounts.isEmpty()) {
            Console.out("No accounts found, inserting default account");
            
            AccountsDataTable defaultAccount = new AccountsDataTable(
                null, "SuperAdmin", 1, "SuperAdmin", "", "", 1, java.sql.Date.valueOf(LocalDate.now())
            );
            
            insertData(defaultAccount, "SuperAdmin".toCharArray());
            
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
    
    public static AccountsDataTable[] getAllData() throws SQLException {
        List<AccountsDataTable> freshDataList = Database.queryForList("SELECT * FROM accounts", AccountsDataTable::new);
        
        if (freshDataList.isEmpty()) {
            refreshData();
            freshDataList = Database.queryForList("SELECT * FROM accounts", AccountsDataTable::new);
        }
        
        return freshDataList.toArray(AccountsDataTable[]::new);
    }
    
// ==== Find =================================================================================================
    
    public static AccountsDataTable findDataById(int id) throws SQLException {
        return Database.queryForObject("SELECT * FROM accounts WHERE id = ?", AccountsDataTable::new, id).orElse(null);
    }
    
    public static AccountsDataTable findDataByUserId(int userId) throws SQLException {
        return Database.queryForObject("SELECT * FROM accounts WHERE userID = ?", AccountsDataTable::new, userId).orElse(null);
    }
    
    public static AccountsDataTable findDataByUsername(String username) throws SQLException {
        return Database.queryForObject("SELECT * FROM accounts WHERE username = ?", AccountsDataTable::new, username).orElse(null);
    }
    
// ==== Check Duplicate ======================================================================================
    
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
        try {
            AccountsDataTable account = null;

            if (usernameOrId.matches("\\d+")) {
                account = findDataByUserId(Integer.parseInt(usernameOrId));
            }
            if (account == null) {
                account = findDataByUsername(usernameOrId);
            }
            if (account == null) return null;

            String hashedInput = hashPassword(charPassword, account.salt());

            if (account.checkPassword(hashedInput)) return account;
            return null;
        } finally {
            Arrays.fill(charPassword, '\0');
        }
    }

    public static boolean verifyLogin(AccountsDataTable data, char[] password) {
        try {
            return data.checkPassword(hashPassword(password, data.salt()));
        } finally {
            Arrays.fill(password, '\0');
        }
    }
    
// ==== Security Methods =====================================================================================
    
    public static String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }

    public static String hashPassword(char[] password, String salt) {
        try {
            KeySpec spec = new PBEKeySpec(password, Base64.getDecoder().decode(salt), 65536, 256);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            byte[] hash = factory.generateSecret(spec).getEncoded();
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new RuntimeException("PBKDF2WithHmacSHA256 is not available in this JVM", e);
        }
    }
    
// ==== CRUD =================================================================================================
    
    public static void deleteData(int id) {
        try {
            Database.executePrepared("DELETE FROM accounts WHERE id = ?", id);
            refreshData(); 
        } catch (SQLException e) {
            Console.errorOut("Deleting data from table accounts error", e);
        }
    }
    
    public static void insertData(AccountsDataTable data, char[] rawPassword) {
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
                    accStmt.setString(4, hashedPassword);
                    accStmt.setString(5, newSalt);
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
                return null;
            });
        } catch (SQLException e) {
            Console.errorOut("Inserting data from table accounts error", e);
        }
    }

    public static void updatePassword(char[] rawPassword, int id) {
        try {
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