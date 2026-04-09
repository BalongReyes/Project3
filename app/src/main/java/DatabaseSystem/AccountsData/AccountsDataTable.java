package DatabaseSystem.AccountsData;

import DatabaseSystem.DataTable.DataTable;
import DatabaseSystem.DataTable.DataTableType;
import MethodsSystem.MethodString;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public record AccountsDataTable(
        
    Integer id, 
    String name, 
    int userId, 
    String username, 
    String password, 
    String salt, 
    int role, 
    Date lastChange
        
) implements DataTable {

    public static final int ID = 1;
    public static final int NAME = 2;
    public static final int USER_ID = 3;
    public static final int USERNAME = 4;
    public static final int ROLE = 5;    

    // Secondary constructor for mapping ResultSet
    public AccountsDataTable(ResultSet results) throws SQLException {
        this(
            results.getInt("id"),
            results.getString("name"),
            results.getInt("userID"),
            results.getString("username"),
            results.getString("password"),
            results.getString("salt"),
            results.getInt("role"),
            results.getDate("lastChange")
        );
    }
    
    public boolean haveData(String data) {
        return MethodString.checkLike(name, data) || MethodString.checkLike(username, data);
    }
    
    public boolean checkPassword(String hashedInputPassword) {
        return this.password.equals(hashedInputPassword);
    }
    
    public boolean idEquals(Integer value) {
        return id != null && id.equals(value);
    }
    
    @Override
    public Object getData(int i) {
        return switch (i) {
            case ID -> id;
            case NAME -> name;
            case USER_ID -> userId;
            case USERNAME -> username;
            case ROLE -> role;
            default -> null;
        };
    }
    
    @Override
    public DataTableType getDataType(int i) {
        return switch (i) {
            case NAME, USERNAME -> DataTableType.TYPE_STRING;
            case ID, USER_ID, ROLE -> DataTableType.TYPE_INTEGER;
            default -> DataTableType.TYPE_NULL;
        };
    }
    
}