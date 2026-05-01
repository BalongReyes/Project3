package DatabaseSystem.UnitsData;

import ConsoleSystem.Console;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.Database;
import java.sql.SQLException;
import java.util.List;

public class UnitsDataHandler {

    private static final String BASE_SELECT_QUERY = """
        SELECT u.*, 
        EXISTS(SELECT 1 FROM unitowners o WHERE o.units_id = u.id) AS has_owner, 
        EXISTS(SELECT 1 FROM unittenants t WHERE t.units_id = u.id) AS has_tenant, 
        EXISTS(SELECT 1 FROM unitowners o WHERE o.units_id = u.id AND o.weekenders = 1) AS is_owner_weekender, 
        EXISTS(SELECT 1 FROM unittenants t WHERE t.units_id = u.id AND t.weekenders = 1) AS is_tenant_weekender, 
        EXISTS(SELECT 1 FROM unitowners o WHERE o.units_id = u.id AND o.noactivity = 1) AS is_owner_no_activity, 
        EXISTS(SELECT 1 FROM unittenants t WHERE t.units_id = u.id AND t.noactivity = 1) AS is_tenant_no_activity 
        FROM units u
        """;
    
    public static UnitsDataTable[] getAllData(boolean refresh) throws SQLException {
        List<UnitsDataTable> freshDataList = Database.queryForList(BASE_SELECT_QUERY, UnitsDataTable::new);
        return freshDataList.toArray(UnitsDataTable[]::new);
    }

    public static UnitsDataTable[] getDataBatchSortedMulti(DataTableFilter[] filters, int limit, int offset) throws SQLException {
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
        else query.append(" ORDER BY u.id ASC");
        
        query.append(" LIMIT ? OFFSET ?");
        params.add(limit);
        params.add(offset);
        
        List<UnitsDataTable> sortedList = Database.queryForList(query.toString(), UnitsDataTable::new, params.toArray());
        return sortedList.toArray(UnitsDataTable[]::new);
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
        
        var query = new StringBuilder("SELECT COUNT(*) FROM units u");
        if (!whereBy.isEmpty()) query.append(" WHERE ").append(whereBy);
        
        return Database.queryForObject(query.toString(), rs -> rs.getInt(1), params.toArray()).orElse(0);
    }
    
    public static int[] getOccupancyTotals(DataTableFilter[] filters) throws SQLException {
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
        
        var query = new StringBuilder("""
            SELECT 
                SUM(CASE WHEN EXISTS(SELECT 1 FROM unittenants t WHERE t.units_id = u.id) THEN 1 ELSE 0 END) as tenants,
                SUM(CASE WHEN EXISTS(SELECT 1 FROM unitowners o WHERE o.units_id = u.id) AND NOT EXISTS(SELECT 1 FROM unittenants t WHERE t.units_id = u.id) THEN 1 ELSE 0 END) as owners,
                SUM(CASE WHEN NOT EXISTS(SELECT 1 FROM unitowners o WHERE o.units_id = u.id) AND NOT EXISTS(SELECT 1 FROM unittenants t WHERE t.units_id = u.id) THEN 1 ELSE 0 END) as others
            FROM units u
            """);
        if (!whereBy.isEmpty()) query.append(" WHERE ").append(whereBy);
        
        return Database.queryForObject(query.toString(), rs -> new int[]{
            rs.getInt("owners"), rs.getInt("tenants"), rs.getInt("others")
        }, params.toArray()).orElse(new int[]{0, 0, 0});
    }
    
    public static UnitsDataTable findDataById(int id) throws SQLException {
        return Database.queryForObject(BASE_SELECT_QUERY + " WHERE u.id = ?", UnitsDataTable::new, id).orElse(null);
    }

    public static String getColumnName(int dataIndex) {
        return switch (dataIndex) {
            case UnitsDataTable.ID -> "u.id";
            case UnitsDataTable.TOWER -> "u.tower";
            case UnitsDataTable.FLOOR -> "u.floor";
            case UnitsDataTable.UNIT -> "u.unit";
            case UnitsDataTable.MODEL -> "u.model";
            case UnitsDataTable.BALCONY -> "u.balcony";
            case UnitsDataTable.FLOOR_AREA -> "u.floorarea";
            default -> "u.id";
        };
    }

    public static void insertData(UnitsDataTable data) {
        try {
            var query = "INSERT INTO units (tower, floor, unit, model, balcony, floorarea) VALUES (?, ?, ?, ?, ?, ?)";
            Database.executePrepared(query, data.tower(), data.floor(), data.unit(), data.model(), data.balcony(), data.floorArea());
        } catch (SQLException e) {
            Console.errorOut("Inserting data from table units error", e);
        }
    }
}