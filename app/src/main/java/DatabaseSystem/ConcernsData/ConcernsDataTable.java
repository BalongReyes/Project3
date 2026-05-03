package DatabaseSystem.ConcernsData;

import DatabaseSystem.DataTable.DataTable;
import DatabaseSystem.DataTable.DataTableType;
import MethodsSystem.MethodString;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public record ConcernsDataTable(
        int id,
        int unitsId,
        int accountsId,
        int residentsId,
        String title,
        String description,
        String category,
        int priority,
        Date dateReported,
        Date dateFinished,
        String status,
        String assignedTo
) implements DataTable {

    public static final int ID = 1;
    public static final int UNITS_ID = 2;
    public static final int ACCOUNTS_ID = 3;
    public static final int RESIDENTS_ID = 4;
    public static final int TITLE = 5;
    public static final int DESCRIPTION = 6;
    public static final int CATEGORY = 7;
    public static final int PRIORITY = 8;
    public static final int DATE_REPORTED = 9;
    public static final int DATE_FINISHED = 10;
    public static final int STATUS = 11;
    public static final int ASSIGNED_TO = 12;

    public ConcernsDataTable(ResultSet results) throws SQLException {
        this(
            results.getInt("id"),
            results.getInt("units_id"),
            results.getInt("accounts_id"),
            results.getInt("residents_id"),
            results.getString("title"),
            results.getString("description"),
            results.getString("category"),
            results.getInt("priority"),
            results.getDate("datereported"),
            results.getDate("datefinished"),
            results.getString("status"),
            results.getString("assignedto")
        );
    }

    public boolean haveData(String data) {
        return MethodString.checkLike(title, data) || 
               MethodString.checkLike(description, data) || 
               MethodString.checkLike(category, data) ||
               MethodString.checkLike(status, data) ||
               MethodString.checkLike(assignedTo, data);
    }

    @Override
    public Object getData(int i) {
        return switch (i) {
            case ID -> id;
            case UNITS_ID -> unitsId;
            case ACCOUNTS_ID -> accountsId;
            case RESIDENTS_ID -> residentsId;
            case TITLE -> title;
            case DESCRIPTION -> description;
            case CATEGORY -> category;
            case PRIORITY -> priority;
            case DATE_REPORTED -> dateReported;
            case DATE_FINISHED -> dateFinished;
            case STATUS -> status;
            case ASSIGNED_TO -> assignedTo;
            default -> null;
        };
    }

    @Override
    public DataTableType getDataType(int i) {
        return switch (i) {
            case TITLE, DESCRIPTION, CATEGORY, STATUS, ASSIGNED_TO -> DataTableType.TYPE_STRING;
            case ID, UNITS_ID, ACCOUNTS_ID, RESIDENTS_ID, PRIORITY -> DataTableType.TYPE_INTEGER;
            case DATE_REPORTED, DATE_FINISHED -> DataTableType.TYPE_DATE;
            default -> DataTableType.TYPE_NULL;
        };
    }
}