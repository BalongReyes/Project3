package DatabaseSystem.UnitOwnersData;

import ConsoleSystem.Console;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UnitOwnersDataHandler {

    // NEW: Base query now joins the 'units' table to get tower, floor, and unit
    private static final String BASE_SELECT_QUERY = """
        SELECT uo.id, uo.residents_id, uo.units_id, uo.weekenders, uo.noactivity, 
        r.lastName, r.firstName, r.middleName, r.autorizedRepresentative, 
        r.birthdate, r.civilStatus, r.gender, r.nationality, r.acrNo, 
        r.employerName, r.profession, r.taxNo, r.created, r.modified, r.mobileNos, 
        u.tower, u.floor, u.unit 
        FROM unitowners uo 
        INNER JOIN residents r ON uo.residents_id = r.id 
        INNER JOIN units u ON uo.units_id = u.id
        """;

    public List<UnitOwnersDataTable> getAllUnitOwners() {
        List<UnitOwnersDataTable> ownerList = new ArrayList<>();
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(BASE_SELECT_QUERY);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                ownerList.add(new UnitOwnersDataTable(rs));
            }
        } catch (SQLException e) {
            Console.errorOut("Error fetching unit owners", e);
        }
        return ownerList;
    }

    // NEW: Implementing the multi-sort/filter method needed by ManagerObjectUnitOwner
    public static UnitOwnersDataTable[] getDataBatchSortedMulti(DataTableFilter[] filters, int limit, int offset) throws SQLException {
        var whereBy = new StringBuilder();
        var orderBy = new StringBuilder();
        
        if (filters != null && filters.length > 0) {
            int whereCount = 0;
            int orderCount = 0;
            
            for (var filter : filters) {
                var columnName = getColumnName(filter.dataIndex());
                
                if (filter.order() == DataTableOrder.WHERE) {
                    if (whereCount++ > 0) whereBy.append(" OR ");
                    whereBy.append(columnName).append(" = '").append(filter.dataWhere()).append("'");
                } else {
                    if (orderCount++ > 0) orderBy.append(", ");
                    String orderStr = (filter.order() == DataTableOrder.ASC) ? "ASC" : "DESC";
                    orderBy.append(columnName).append(" ").append(orderStr);
                }
            }
        }
        
        var query = new StringBuilder(BASE_SELECT_QUERY);
        if (!whereBy.isEmpty()) query.append(" WHERE ").append(whereBy);
        
        if (!orderBy.isEmpty()) query.append(" ORDER BY ").append(orderBy);
        else query.append(" ORDER BY uo.id ASC");
        
        query.append(" LIMIT ? OFFSET ?");
        
        List<UnitOwnersDataTable> sortedList = Database.queryForList(query.toString(), UnitOwnersDataTable::new, limit, offset);
        return sortedList.toArray(UnitOwnersDataTable[]::new);
    }

    // NEW: Helper mapping for dynamic filtering
    public static String getColumnName(int dataIndex) {
        return switch (dataIndex) {
            case UnitOwnersDataTable.ID -> "uo.id";
            case UnitOwnersDataTable.TOWER -> "u.tower";
            case UnitOwnersDataTable.FLOOR -> "u.floor";
            case UnitOwnersDataTable.UNIT -> "u.unit";
            case UnitOwnersDataTable.LAST_NAME -> "r.lastName";
            case UnitOwnersDataTable.FIRST_NAME -> "r.firstName";
            default -> "uo.id";
        };
    }
}