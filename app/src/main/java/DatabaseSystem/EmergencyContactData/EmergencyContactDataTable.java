package DatabaseSystem.EmergencyContactData;

import DatabaseSystem.DataTable.DataTable;
import DatabaseSystem.DataTable.DataTableType;
import MethodsSystem.MethodString;
import java.sql.ResultSet;
import java.sql.SQLException;

public record EmergencyContactDataTable(
        int id,
        int residentsId,
        String lastName,
        String firstName,
        String middleName,
        String relationship,
        String contactNumber
) implements DataTable {

    public static final int ID = 1;
    public static final int RESIDENTS_ID = 2;
    public static final int LAST_NAME = 3;
    public static final int FIRST_NAME = 4;
    public static final int MIDDLE_NAME = 5;
    public static final int RELATIONSHIP = 6;
    public static final int CONTACT_NUMBER = 7;

    public EmergencyContactDataTable(ResultSet results) throws SQLException {
        this(
            results.getInt("id"),
            results.getInt("residents_id"),
            results.getString("lastName"),
            results.getString("firstName"),
            results.getString("middleName"),
            results.getString("relationship"),
            results.getString("contactNumber")
        );
    }

    public boolean haveData(String data) {
        return MethodString.checkLike(firstName, data) || 
               MethodString.checkLike(lastName, data) || 
               MethodString.checkLike(contactNumber, data);
    }

    @Override
    public Object getData(int i) {
        return switch (i) {
            case ID -> id;
            case RESIDENTS_ID -> residentsId;
            case LAST_NAME -> lastName;
            case FIRST_NAME -> firstName;
            case MIDDLE_NAME -> middleName;
            case RELATIONSHIP -> relationship;
            case CONTACT_NUMBER -> contactNumber;
            default -> null;
        };
    }

    @Override
    public DataTableType getDataType(int i) {
        return switch (i) {
            case LAST_NAME, FIRST_NAME, MIDDLE_NAME, RELATIONSHIP, CONTACT_NUMBER -> DataTableType.TYPE_STRING;
            case ID, RESIDENTS_ID -> DataTableType.TYPE_INTEGER;
            default -> DataTableType.TYPE_NULL;
        };
    }

    public String getFullName() {
        String middle = (middleName != null && !middleName.isEmpty()) ? middleName + " " : "";
        return MethodString.capitalizeWords(firstName + " " + middle + lastName);
    }
}
