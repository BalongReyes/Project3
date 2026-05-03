package DatabaseSystem.ConcernsData;

import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.Database;
import java.sql.SQLException;
import java.util.List;

public class ConcernsDataHandler {

    private static final String BASE_SELECT_QUERY = "SELECT * FROM concerns";

    public static List<ConcernsDataTable> getConcernsByUnitId(int unitId) throws SQLException {
        String query = BASE_SELECT_QUERY + " WHERE units_id = ?";
        return Database.queryForList(query, ConcernsDataTable::new, unitId);
    }

    public static List<ConcernsDataTable> getConcernsByResidentId(int residentId) throws SQLException {
        String query = BASE_SELECT_QUERY + " WHERE residents_id = ?";
        return Database.queryForList(query, ConcernsDataTable::new, residentId);
    }

    public static ConcernsDataTable[] getDataBatchSortedMulti(DataTableFilter[] filters, String search, int limit, int offset) throws SQLException {
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
            whereBy.append("(title LIKE ? OR description LIKE ? OR category LIKE ? OR status LIKE ? OR assignedto LIKE ?)");
            String likeQuery = "%" + search.trim() + "%";
            for (int i = 0; i < 5; i++) {
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
        
        List<ConcernsDataTable> sortedList = Database.queryForList(query.toString(), ConcernsDataTable::new, params.toArray());
        return sortedList.toArray(ConcernsDataTable[]::new);
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
            whereBy.append("(title LIKE ? OR description LIKE ? OR category LIKE ? OR status LIKE ? OR assignedto LIKE ?)");
            String likeQuery = "%" + search.trim() + "%";
            for (int i = 0; i < 5; i++) {
                params.add(likeQuery);
            }
        }
        
        var query = new StringBuilder("SELECT COUNT(*) FROM concerns");
        if (!whereBy.isEmpty()) query.append(" WHERE ").append(whereBy);
        
        return Database.queryForObject(query.toString(), rs -> rs.getInt(1), params.toArray()).orElse(0);
    }

    public static String getColumnName(int dataIndex) {
        return switch (dataIndex) {
            case ConcernsDataTable.ID -> "id";
            case ConcernsDataTable.UNITS_ID -> "units_id";
            case ConcernsDataTable.ACCOUNTS_ID -> "accounts_id";
            case ConcernsDataTable.RESIDENTS_ID -> "residents_id";
            case ConcernsDataTable.TITLE -> "title";
            case ConcernsDataTable.DESCRIPTION -> "description";
            case ConcernsDataTable.CATEGORY -> "category";
            case ConcernsDataTable.PRIORITY -> "priority";
            case ConcernsDataTable.DATE_REPORTED -> "datereported";
            case ConcernsDataTable.DATE_FINISHED -> "datefinished";
            case ConcernsDataTable.STATUS -> "status";
            case ConcernsDataTable.ASSIGNED_TO -> "assignedto";
            default -> "id";
        };
    }
}