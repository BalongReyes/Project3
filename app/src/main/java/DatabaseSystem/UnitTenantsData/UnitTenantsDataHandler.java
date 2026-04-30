package DatabaseSystem.UnitTenantsData;

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

/**
 * UnitTenantsDataHandler handles database operations for Tenants,
 * joining residents and units tables for comprehensive data retrieval.
 */
public class UnitTenantsDataHandler {

    // BASE_SELECT_QUERY joins unittenants with residents and units[cite: 7].
    private static final String BASE_SELECT_QUERY = """
        SELECT ut.id, ut.residents_id, ut.units_id, ut.weekenders, ut.noactivity, ut.move_in, ut.move_out, 
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
            Console.errorOut("Error fetching unit tenants", e);
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
    
    public static String getColumnName(int dataIndex) {
        return switch (dataIndex) {
            case UnitTenantsDataTable.ID -> "ut.id";
            case UnitTenantsDataTable.RESIDENTS_ID -> "ut.residents_id";
            case UnitTenantsDataTable.UNITS_ID -> "ut.units_id";
            case UnitTenantsDataTable.WEEKENDERS -> "ut.weekenders";
            case UnitTenantsDataTable.NO_ACTIVITY -> "ut.noactivity";
            case UnitTenantsDataTable.MOVE_IN -> "ut.move_in";
            case UnitTenantsDataTable.MOVE_OUT -> "ut.move_out";
            case UnitTenantsDataTable.LAST_NAME -> "r.lastName";
            case UnitTenantsDataTable.FIRST_NAME -> "r.firstName";
            case UnitTenantsDataTable.MIDDLE_NAME -> "r.middleName";
            case UnitTenantsDataTable.AUTHORIZED_REPRESENTATIVE -> "r.autorizedRepresentative";
            case UnitTenantsDataTable.BIRTHDATE -> "r.birthdate";
            case UnitTenantsDataTable.CIVIL_STATUS -> "r.civilStatus";
            case UnitTenantsDataTable.GENDER -> "r.gender";
            case UnitTenantsDataTable.NATIONALITY -> "r.nationality";
            case UnitTenantsDataTable.ACR_NO -> "r.acrNo";
            case UnitTenantsDataTable.EMPLOYER_NAME -> "r.employerName";
            case UnitTenantsDataTable.PROFESSION -> "r.profession";
            case UnitTenantsDataTable.TAX_NO -> "r.taxNo";
            case UnitTenantsDataTable.CREATED -> "r.created";
            case UnitTenantsDataTable.MODIFIED -> "r.modified";
            case UnitTenantsDataTable.MOBILE_NOS -> "r.mobileNos";
            case UnitTenantsDataTable.TOWER -> "u.tower";
            case UnitTenantsDataTable.FLOOR -> "u.floor";
            case UnitTenantsDataTable.UNIT -> "u.unit";
            default -> "ut.id";
        };
    }
}