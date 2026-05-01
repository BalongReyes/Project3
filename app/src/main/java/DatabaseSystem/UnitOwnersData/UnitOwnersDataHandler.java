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

    public static UnitOwnersDataTable[] getDataBatchSortedMulti(DataTableFilter[] filters, int limit, int offset) throws SQLException {
        var whereBy = new StringBuilder();
        var orderBy = new StringBuilder();
        
        java.util.List<Object> params = new java.util.ArrayList<>();

        if (filters != null && filters.length > 0) {
            int whereCount = 0;
            int orderCount = 0;
            
            for (var filter : filters) {
                var columnName = getColumnName(filter.dataIndex());
                
                if (filter.order() == DataTableOrder.WHERE) {
                    if (whereCount++ > 0) whereBy.append(" OR ");
                    whereBy.append(columnName).append(" = ?");
                    params.add(filter.dataWhere());
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
        params.add(limit);
        params.add(offset);
        
        List<UnitOwnersDataTable> sortedList = Database.queryForList(query.toString(), UnitOwnersDataTable::new, params.toArray());
        return sortedList.toArray(UnitOwnersDataTable[]::new);
    }
    
    public static int getDataCountMulti(DataTableFilter[] filters) throws SQLException {
        var whereBy = new StringBuilder();
        java.util.List<Object> params = new java.util.ArrayList<>();
        
        if (filters != null && filters.length > 0) {
            int whereCount = 0;
            for (var filter : filters) {
                var columnName = getColumnName(filter.dataIndex());
                if (filter.order() == DataTableOrder.WHERE) {
                    if (whereCount++ > 0) whereBy.append(" OR ");
                    whereBy.append(columnName).append(" = ?");
                    params.add(filter.dataWhere());
                }
            }
        }
        
        var query = new StringBuilder("SELECT COUNT(*) FROM unitowners uo INNER JOIN residents r ON uo.residents_id = r.id INNER JOIN units u ON uo.units_id = u.id");
        if (!whereBy.isEmpty()) query.append(" WHERE ").append(whereBy);
        
        return Database.queryForObject(query.toString(), rs -> rs.getInt(1), params.toArray()).orElse(0);
    }
    
    public static String getColumnName(int dataIndex) {
        return switch (dataIndex) {
            case UnitOwnersDataTable.ID -> "uo.id";
            case UnitOwnersDataTable.RESIDENTS_ID -> "uo.residents_id";
            case UnitOwnersDataTable.UNITS_ID -> "uo.units_id";
            case UnitOwnersDataTable.WEEKENDERS -> "uo.weekenders";
            case UnitOwnersDataTable.NO_ACTIVITY -> "uo.noactivity";
            case UnitOwnersDataTable.LAST_NAME -> "r.lastName";
            case UnitOwnersDataTable.FIRST_NAME -> "r.firstName";
            case UnitOwnersDataTable.MIDDLE_NAME -> "r.middleName";
            case UnitOwnersDataTable.AUTHORIZED_REPRESENTATIVE -> "r.autorizedRepresentative";
            case UnitOwnersDataTable.BIRTHDATE -> "r.birthdate";
            case UnitOwnersDataTable.CIVIL_STATUS -> "r.civilStatus";
            case UnitOwnersDataTable.GENDER -> "r.gender";
            case UnitOwnersDataTable.NATIONALITY -> "r.nationality";
            case UnitOwnersDataTable.ACR_NO -> "r.acrNo";
            case UnitOwnersDataTable.EMPLOYER_NAME -> "r.employerName";
            case UnitOwnersDataTable.PROFESSION -> "r.profession";
            case UnitOwnersDataTable.TAX_NO -> "r.taxNo";
            case UnitOwnersDataTable.CREATED -> "r.created";
            case UnitOwnersDataTable.MODIFIED -> "r.modified";
            case UnitOwnersDataTable.MOBILE_NOS -> "r.mobileNos";
            case UnitOwnersDataTable.TOWER -> "u.tower";
            case UnitOwnersDataTable.FLOOR -> "u.floor";
            case UnitOwnersDataTable.UNIT -> "u.unit";
            default -> "uo.id";
        };
    }
}