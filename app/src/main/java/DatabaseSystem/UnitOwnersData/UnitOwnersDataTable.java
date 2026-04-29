package DatabaseSystem.UnitOwnersData;

import DatabaseSystem.DataTable.DataTable;
import DatabaseSystem.DataTable.DataTableType;
import MethodsSystem.MethodString;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public record UnitOwnersDataTable(
        // 'unitowners' fields
        int id,
        int residentsId,
        int unitsId,
        int weekenders,
        int noActivity,

        // 'residents' fields
        String lastName,
        String firstName,
        String middleName,
        String authorizedRepresentative,
        Date birthdate,
        String civilStatus,
        int gender,
        String nationality,
        String acrNo,
        String employerName,
        String profession,
        int taxNo,
        Date created,
        Date modified,
        String mobileNos,
        
        // NEW: 'units' fields
        String tower,
        int floor,
        int unit
) implements DataTable {

    // Constants for column indexing
    public static final int ID = 1;
    public static final int RESIDENTS_ID = 2;
    public static final int UNITS_ID = 3;
    public static final int WEEKENDERS = 4;
    public static final int NO_ACTIVITY = 5;
    
    public static final int LAST_NAME = 6;
    public static final int FIRST_NAME = 7;
    public static final int MIDDLE_NAME = 8;
    public static final int AUTHORIZED_REPRESENTATIVE = 9;
    public static final int BIRTHDATE = 10;
    public static final int CIVIL_STATUS = 11;
    public static final int GENDER = 12;
    public static final int NATIONALITY = 13;
    public static final int ACR_NO = 14;
    public static final int EMPLOYER_NAME = 15;
    public static final int PROFESSION = 16;
    public static final int TAX_NO = 17;
    public static final int CREATED = 18;
    public static final int MODIFIED = 19;
    public static final int MOBILE_NOS = 20;
    
    // NEW: Constants for unit fields
    public static final int TOWER = 21;
    public static final int FLOOR = 22;
    public static final int UNIT = 23;

    public UnitOwnersDataTable(ResultSet results) throws SQLException {
        this(
            results.getInt("id"), 
            results.getInt("residents_id"),
            results.getInt("units_id"),
            results.getInt("weekenders"),
            results.getInt("noactivity"),
            
            results.getString("lastName"),
            results.getString("firstName"),
            results.getString("middleName"),
            results.getString("autorizedRepresentative"),
            results.getDate("birthdate"),
            results.getString("civilStatus"),
            results.getInt("gender"),
            results.getString("nationality"),
            results.getString("acrNo"),
            results.getString("employerName"),
            results.getString("profession"),
            results.getInt("taxNo"),
            results.getDate("created"),
            results.getDate("modified"),
            results.getString("mobileNos"),
            
            // NEW: Fetching unit data
            results.getString("tower"),
            results.getInt("floor"),
            results.getInt("unit")
        );
    }

    public boolean haveData(String data) {
        return MethodString.checkLike(firstName, data) || 
               MethodString.checkLike(lastName, data) || 
               MethodString.checkLike(middleName, data) ||
               MethodString.checkLike(mobileNos, data) ||
               MethodString.checkLike(tower, data) || 
               MethodString.checkLike(String.valueOf(floor), data) || 
               MethodString.checkLike(String.valueOf(unit), data);
    }

    @Override
    public Object getData(int i) {
        return switch (i) {
            case ID -> id;
            case RESIDENTS_ID -> residentsId;
            case UNITS_ID -> unitsId;
            case WEEKENDERS -> weekenders;
            case NO_ACTIVITY -> noActivity;
            case LAST_NAME -> lastName;
            case FIRST_NAME -> firstName;
            case MIDDLE_NAME -> middleName;
            case AUTHORIZED_REPRESENTATIVE -> authorizedRepresentative;
            case BIRTHDATE -> birthdate;
            case CIVIL_STATUS -> civilStatus;
            case GENDER -> gender;
            case NATIONALITY -> nationality;
            case ACR_NO -> acrNo;
            case EMPLOYER_NAME -> employerName;
            case PROFESSION -> profession;
            case TAX_NO -> taxNo;
            case CREATED -> created;
            case MODIFIED -> modified;
            case MOBILE_NOS -> mobileNos;
            // NEW: Mapping for switch
            case TOWER -> tower;
            case FLOOR -> floor;
            case UNIT -> unit;
            default -> null;
        };
    }

    @Override
    public DataTableType getDataType(int i) {
        return switch (i) {
            case LAST_NAME, FIRST_NAME, MIDDLE_NAME, AUTHORIZED_REPRESENTATIVE, 
                 CIVIL_STATUS, NATIONALITY, ACR_NO, EMPLOYER_NAME, PROFESSION, MOBILE_NOS, TOWER -> DataTableType.TYPE_STRING;
            case ID, RESIDENTS_ID, UNITS_ID, WEEKENDERS, NO_ACTIVITY, GENDER, TAX_NO, FLOOR, UNIT -> DataTableType.TYPE_INTEGER;
            case BIRTHDATE, CREATED, MODIFIED -> DataTableType.TYPE_DATE;
            default -> DataTableType.TYPE_NULL;
        };
    }

    public String getFullName() {
        String middle = (middleName != null && !middleName.isEmpty()) ? middleName + " " : "";
        return firstName + " " + middle + lastName;
    }
}