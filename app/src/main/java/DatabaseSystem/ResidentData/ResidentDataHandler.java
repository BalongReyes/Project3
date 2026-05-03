package DatabaseSystem.ResidentData;

import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.Database;
import java.sql.SQLException;
import java.util.List;

public class ResidentDataHandler {

    private static final String BASE_SELECT_QUERY = "SELECT * FROM residents";

    public static List<ResidentDataTable> getAllData() throws SQLException {
        return Database.queryForList(BASE_SELECT_QUERY, ResidentDataTable::new);
    }

    public static ResidentDataTable[] getDataBatchSortedMulti(DataTableFilter[] filters, String search, int limit, int offset) throws SQLException {
        var whereBy = new StringBuilder();
        var orderBy = new StringBuilder();
        
        java.util.List<Object> params = new java.util.ArrayList<>();

        if (filters != null && filters.length > 0) {
            int whereCount = 0;
            int orderCount = 0;
            StringBuilder filterWhere = new StringBuilder();
            
            for (var filter : filters) {
                var columnName = getColumnName(filter.dataIndex());
                
                if (filter.order() == DataTableOrder.WHERE) {
                    if (whereCount++ > 0) filterWhere.append(" OR ");
                    filterWhere.append(columnName).append(" = ?");
                    params.add(filter.dataWhere());
                } else {
                    if (orderCount++ > 0) orderBy.append(", ");
                    String orderStr = (filter.order() == DataTableOrder.ASC) ? "ASC" : "DESC";
                    orderBy.append(columnName).append(" ").append(orderStr);
                }
            }
            if (whereCount > 0) {
                whereBy.append("(").append(filterWhere).append(")");
            }
        }
        
        if (search != null && !search.trim().isEmpty()) {
            if (!whereBy.isEmpty()) whereBy.append(" AND ");
            whereBy.append("(firstName LIKE ? OR lastName LIKE ? OR middleName LIKE ? OR mobileNos LIKE ?)");
            String likeQuery = "%" + search.trim() + "%";
            for (int i = 0; i < 4; i++) {
                params.add(likeQuery);
            }
        }
        
        var query = new StringBuilder(BASE_SELECT_QUERY);
        if (!whereBy.isEmpty()) query.append(" WHERE ").append(whereBy);
        
        if (!orderBy.isEmpty()) query.append(" ORDER BY ").append(orderBy);
        else query.append(" ORDER BY id ASC");
        
        query.append(" LIMIT ? OFFSET ?");
        params.add(limit);
        params.add(offset);
        
        List<ResidentDataTable> sortedList = Database.queryForList(query.toString(), ResidentDataTable::new, params.toArray());
        return sortedList.toArray(ResidentDataTable[]::new);
    }
    
    public static int getDataCountMulti(DataTableFilter[] filters, String search) throws SQLException {
        var whereBy = new StringBuilder();
        java.util.List<Object> params = new java.util.ArrayList<>();
        
        if (filters != null && filters.length > 0) {
            int whereCount = 0;
            StringBuilder filterWhere = new StringBuilder();
            for (var filter : filters) {
                var columnName = getColumnName(filter.dataIndex());
                if (filter.order() == DataTableOrder.WHERE) {
                    if (whereCount++ > 0) filterWhere.append(" OR ");
                    filterWhere.append(columnName).append(" = ?");
                    params.add(filter.dataWhere());
                }
            }
            if (whereCount > 0) {
                whereBy.append("(").append(filterWhere).append(")");
            }
        }
        
        if (search != null && !search.trim().isEmpty()) {
            if (!whereBy.isEmpty()) whereBy.append(" AND ");
            whereBy.append("(firstName LIKE ? OR lastName LIKE ? OR middleName LIKE ? OR mobileNos LIKE ?)");
            String likeQuery = "%" + search.trim() + "%";
            for (int i = 0; i < 4; i++) {
                params.add(likeQuery);
            }
        }
        
        var query = new StringBuilder("SELECT COUNT(*) FROM residents");
        if (!whereBy.isEmpty()) query.append(" WHERE ").append(whereBy);
        
        return Database.queryForObject(query.toString(), rs -> rs.getInt(1), params.toArray()).orElse(0);
    }

    public static ResidentDataTable findDataById(int id) throws SQLException {
        return Database.queryForObject(BASE_SELECT_QUERY + " WHERE id = ?", ResidentDataTable::new, id).orElse(null);
    }

    public static ResidentDataTable getOwnerResidentByUnitId(int unitId) throws SQLException {
        String query = "SELECT r.* FROM residents r INNER JOIN unitowners uo ON r.id = uo.residents_id WHERE uo.units_id = ? LIMIT 1";
        return Database.queryForObject(query, ResidentDataTable::new, unitId).orElse(null);
    }
    
    public static ResidentDataTable getTenantResidentByUnitId(int unitId) throws SQLException {
        String query = "SELECT r.* FROM residents r INNER JOIN unittenants ut ON r.id = ut.residents_id WHERE ut.units_id = ? ORDER BY ut.id DESC LIMIT 1";
        return Database.queryForObject(query, ResidentDataTable::new, unitId).orElse(null);
    }

    // TODO: Add generic CRUD operations like insert, update, or delete methods. 
    public static String getColumnName(int dataIndex) {
        return switch (dataIndex) {
            case ResidentDataTable.ID -> "id";
            case ResidentDataTable.LAST_NAME -> "lastName";
            case ResidentDataTable.FIRST_NAME -> "firstName";
            case ResidentDataTable.MIDDLE_NAME -> "middleName";
            case ResidentDataTable.AUTHORIZED_REPRESENTATIVE -> "autorizedRepresentative";
            case ResidentDataTable.BIRTHDATE -> "birthdate";
            case ResidentDataTable.CIVIL_STATUS -> "civilStatus";
            case ResidentDataTable.GENDER -> "gender";
            case ResidentDataTable.NATIONALITY -> "nationality";
            case ResidentDataTable.ACR_NO -> "acrNo";
            case ResidentDataTable.EMPLOYER_NAME -> "employerName";
            case ResidentDataTable.PROFESSION -> "profession";
            case ResidentDataTable.TAX_NO -> "taxNo";
            case ResidentDataTable.CREATED -> "created";
            case ResidentDataTable.MODIFIED -> "modified";
            case ResidentDataTable.MOBILE_NOS -> "mobileNos";
            default -> "id";
        };
    }
}
