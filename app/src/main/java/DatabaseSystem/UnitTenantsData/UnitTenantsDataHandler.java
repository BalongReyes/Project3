package DatabaseSystem.UnitTenantsData;

import DatabaseSystem.Database;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * UnitTenantsDataHandler handles database operations for Tenants,
 * joining residents and units tables for comprehensive data retrieval.
 */
public class UnitTenantsDataHandler {

    // BASE_SELECT_QUERY joins unittenants with residents and units[cite: 7].
    private static final String BASE_SELECT_QUERY = """
        SELECT ut.id, ut.residents_id, ut.units_id, ut.weekenders, ut.noactivity, 
        r.lastName, r.firstName, r.middleName, r.autorizedRepresentative, 
        r.birthdate, r.civilStatus, r.gender, r.nationality, r.acrNo, 
        r.employerName, r.profession, r.taxNo, r.created, r.modified, r.mobileNos, 
        u.tower, u.floor, u.unit 
        FROM unittenants ut 
        INNER JOIN residents r ON ut.residents_id = r.id 
        INNER JOIN units u ON ut.units_id = u.id
        """;

    public List<UnitTenantsDataTable> getAllUnitTenants() {
        List<UnitTenantsDataTable> tenantList = new ArrayList<>();
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(BASE_SELECT_QUERY);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                tenantList.add(new UnitTenantsDataTable(rs));
            }
        } catch (SQLException e) {
            System.err.println("Error fetching unit tenants: " + e.getMessage());
        }
        return tenantList;
    }

    /**
     * Fetches a sorted and filtered batch of tenant data[cite: 7].
     */
    public static UnitTenantsDataTable[] getDataBatchSortedMulti(DataTableFilter[] filters, int limit, int offset) throws SQLException {
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
        else query.append(" ORDER BY ut.id ASC");
        
        query.append(" LIMIT ? OFFSET ?");
        
        List<UnitTenantsDataTable> sortedList = Database.queryForList(query.toString(), UnitTenantsDataTable::new, limit, offset);
        return sortedList.toArray(UnitTenantsDataTable[]::new);
    }

    /**
     * Maps DataTable indices to database column names for dynamic queries[cite: 7].
     */
    public static String getColumnName(int dataIndex) {
        return switch (dataIndex) {
            case UnitTenantsDataTable.ID -> "ut.id";
            case UnitTenantsDataTable.TOWER -> "u.tower";
            case UnitTenantsDataTable.FLOOR -> "u.floor";
            case UnitTenantsDataTable.UNIT -> "u.unit";
            case UnitTenantsDataTable.LAST_NAME -> "r.lastName";
            case UnitTenantsDataTable.FIRST_NAME -> "r.firstName";
            default -> "ut.id";
        };
    }
}