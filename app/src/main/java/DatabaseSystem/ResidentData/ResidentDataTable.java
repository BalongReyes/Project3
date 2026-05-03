package DatabaseSystem.ResidentData;

import DatabaseSystem.DataTable.DataTable;
import DatabaseSystem.DataTable.DataTableType;
import MethodsSystem.MethodString;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public record ResidentDataTable(
        int id,
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
        String mobileNos
) implements DataTable {

    public static final int ID = 1;
    public static final int LAST_NAME = 2;
    public static final int FIRST_NAME = 3;
    public static final int MIDDLE_NAME = 4;
    public static final int AUTHORIZED_REPRESENTATIVE = 5;
    public static final int BIRTHDATE = 6;
    public static final int CIVIL_STATUS = 7;
    public static final int GENDER = 8;
    public static final int NATIONALITY = 9;
    public static final int ACR_NO = 10;
    public static final int EMPLOYER_NAME = 11;
    public static final int PROFESSION = 12;
    public static final int TAX_NO = 13;
    public static final int CREATED = 14;
    public static final int MODIFIED = 15;
    public static final int MOBILE_NOS = 16;

    public ResidentDataTable(ResultSet results) throws SQLException {
        this(
            results.getInt("id"),
            results.getString("lastName"),
            results.getString("firstName"),
            results.getString("middleName"),
            results.getString("autorizedRepresentative"), // Preserving DB schema spelling
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
            results.getString("mobileNos")
        );
    }

    public boolean haveData(String data) {
        return MethodString.checkLike(firstName, data) || 
               MethodString.checkLike(lastName, data) || 
               MethodString.checkLike(middleName, data) ||
               MethodString.checkLike(mobileNos, data);
    }

    @Override
    public Object getData(int i) {
        return switch (i) {
            case ID -> id;
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
            default -> null;
        };
    }

    @Override
    public DataTableType getDataType(int i) {
        return switch (i) {
            case LAST_NAME, FIRST_NAME, MIDDLE_NAME, AUTHORIZED_REPRESENTATIVE, 
                 CIVIL_STATUS, NATIONALITY, ACR_NO, EMPLOYER_NAME, PROFESSION, MOBILE_NOS -> DataTableType.TYPE_STRING;
            case ID, GENDER, TAX_NO -> DataTableType.TYPE_INTEGER;
            case BIRTHDATE, CREATED, MODIFIED -> DataTableType.TYPE_DATE;
            default -> DataTableType.TYPE_NULL;
        };
    }

    public String getFullName() {
        String middle = (middleName != null && !middleName.isEmpty()) ? middleName + " " : "";
        return MethodString.capitalizeWords(firstName + " " + middle + lastName);
    }
    
}
