package DatabaseSystem.UnitsData;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConsoleSystem.Console;
import ConsoleSystem.ConsoleColors;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.Database;
import MainSystem.Main;

public class UnitsDataHandler {

    private static final List<UnitsDataTable> array = new ArrayList<>();
    
    // Modern Text Block for SQL Query
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
    
    public static void refreshData() throws SQLException {
        array.clear();
        Database.executePreparedQuery(BASE_SELECT_QUERY, (result) -> {
            while (result.next()) {
                array.add(new UnitsDataTable(result));
            }
        });
        
        if (Main.debugDataHandlerRefresh) Console.out("UnitsDataHandler refreshed", ConsoleColors.YELLOW);
    }
    
    public static UnitsDataTable[] getAllData(boolean refresh) throws SQLException {
        if (refresh || array.isEmpty()) refreshData();
        return array.toArray(UnitsDataTable[]::new);
    }

    public static UnitsDataTable[] getDataBatchSortedMulti(boolean refresh, DataTableFilter[] filters, int limit, int offset) throws SQLException {
        var whereBy = new StringBuilder();
        var orderBy = new StringBuilder();
        
        if (filters != null && filters.length > 0) {
            int whereCount = 0;
            int orderCount = 0;
            
            for (var filter : filters) {
                var columnName = getColumnName(filter.dataIndex()); // calling record accessor
                
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
        else query.append(" ORDER BY id ASC");
        
        query.append(" LIMIT ? OFFSET ?");
        
        var sortedList = new ArrayList<UnitsDataTable>();
        Database.executePreparedQuery(query.toString(), (result) -> {
            while (result.next()) {
                sortedList.add(new UnitsDataTable(result));
            }
        }, limit, offset);
        
        return sortedList.toArray(UnitsDataTable[]::new);
    }
    
    public static UnitsDataTable findDataById(int id) throws SQLException {
        var resultHolder = new UnitsDataTable[1];
        Database.executePreparedQuery(BASE_SELECT_QUERY + " WHERE id = ?", (result) -> {
            if (result.next()) {
                resultHolder[0] = new UnitsDataTable(result);
            }
        }, id);
        return resultHolder[0];
    }

    public static String getColumnName(int dataIndex) {
        return switch (dataIndex) {
            case UnitsDataTable.ID -> "id";
            case UnitsDataTable.TOWER -> "tower";
            case UnitsDataTable.FLOOR -> "floor";
            case UnitsDataTable.UNIT -> "unit";
            case UnitsDataTable.MODEL -> "model";
            case UnitsDataTable.BALCONY -> "balcony";
            case UnitsDataTable.FLOOR_AREA -> "floorarea";
            default -> "id";
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