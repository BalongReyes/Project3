package DatabaseSystem.UnitsData;

import ConsoleSystem.Console;
import ConsoleSystem.ConsoleColors;
import DatabaseSystem.DataTable.DataTableFilter;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.Database;
import MainSystem.Main;
import java.sql.SQLException;
import java.util.ArrayList;

public class UnitsDataHandler {

    private static ArrayList<UnitsDataTable> array = new ArrayList<>();
    
    private static final String BASE_SELECT_QUERY = 
        "SELECT u.*, " +
        "EXISTS(SELECT 1 FROM unitowners o WHERE o.units_id = u.id) AS has_owner, " +
        "EXISTS(SELECT 1 FROM unittenants t WHERE t.units_id = u.id) AS has_tenant, " +
        "EXISTS(SELECT 1 FROM unitowners o WHERE o.units_id = u.id AND o.weekenders = 1) AS is_owner_weekender, " +
        "EXISTS(SELECT 1 FROM unittenants t WHERE t.units_id = u.id AND t.weekenders = 1) AS is_tenant_weekender, " +
        "EXISTS(SELECT 1 FROM unitowners o WHERE o.units_id = u.id AND o.noactivity = 1) AS is_owner_no_activity, " +
        "EXISTS(SELECT 1 FROM unittenants t WHERE t.units_id = u.id AND t.noactivity = 1) AS is_tenant_no_activity " +
        "FROM units u";
    
    public static void refreshData() throws SQLException {
        array.clear();
        
        // SECURED: Now uses executePreparedQuery
        Database.executePreparedQuery(BASE_SELECT_QUERY, (result) -> {
            while (result.next()) {
                UnitsDataTable data = new UnitsDataTable(result);
                if (!data.isError()) array.add(data);
            }
        });
        
        if (Main.debugDataHandlerRefresh) Console.out("UnitsDataHandler refreshed", ConsoleColors.YELLOW);
    }
    
    public static UnitsDataTable[] getAllData(boolean refresh) throws SQLException {
        if (refresh || array.isEmpty()) refreshData();
        return array.toArray(UnitsDataTable[]::new);
    }
    
// Search & Sort Methods =====================================================================================

    public static UnitsDataTable[] getDataBatchSorted(boolean refresh, int dataIndex, DataTableOrder order, int limit, int offset) throws SQLException {
        String query = BASE_SELECT_QUERY + " ORDER BY " + getColumnName(dataIndex) + " " + order.getString() + " LIMIT ? OFFSET ?";
        
        ArrayList<UnitsDataTable> sortedArray = new ArrayList<>();
        Database.executePreparedQuery(query, (result) -> {
            while (result.next()) {
                UnitsDataTable data = new UnitsDataTable(result);
                if (!data.isError()) sortedArray.add(data);
            }
        }, limit, offset);
        
        return sortedArray.toArray(UnitsDataTable[]::new);
    }
    
    // Handles sorting using an array of DataTableFilter objects
    public static UnitsDataTable[] getDataBatchSortedMulti(boolean refresh, DataTableFilter[] filters, int limit, int offset) throws SQLException {
        StringBuilder whereBy = new StringBuilder();
        
        // Safety check: If no filters are provided
        if (filters != null && filters.length != 0) {
            int n = 0;
            for (int i = 0; i < filters.length; i++) {
                DataTableFilter filter = filters[i];
                if(filter.getOrder() == DataTableOrder.Where){
                    // Add a comma separator if it is not the very last filter in the array
                    if (n > 0) {
                        whereBy.append(" OR ");
                    }
                    
                    String columnName = getColumnName(filter.getDataIndex());
                    String dataString = filter.getDataWhere();

                    whereBy.append(columnName).append(" = '").append(dataString).append("'");

                    n++;
                }
            }
        }
        
        StringBuilder orderBy = new StringBuilder();
        
        // Safety check: If no filters are provided, default to sorting by ID
        if (filters != null && filters.length != 0) {
            // Loop through all provided DataTableFilter objects
            int n = 0;
            for (int i = 0; i < filters.length; i++) {
                DataTableFilter filter = filters[i];
                if(filter.getOrder() != DataTableOrder.Where){
                    // Add a comma separator if it is not the very last filter in the array
                    if (n > 0) {
                        orderBy.append(", ");
                    }
                    
                    String columnName = getColumnName(filter.getDataIndex());
                    String orderString = (filter.getOrder() == DataTableOrder.Asc) ? "ASC" : "DESC";

                    orderBy.append(columnName).append(" ").append(orderString);

                    n++;
                }
            }
        }
        
        // Assemble the final query
        String query = BASE_SELECT_QUERY;
        if(!whereBy.isEmpty()){
            query += " WHERE " + whereBy.toString();
        }
        if(!orderBy.isEmpty()){
            query += " ORDER BY " + orderBy.toString();
        }else{
            query += " ORDER BY id ASC";
        }
        query += " LIMIT ? OFFSET ?";
        
        ArrayList<UnitsDataTable> sortedArray = new ArrayList<>();
        
        Database.executePreparedQuery(query, (result) -> {
            while (result.next()) {
                UnitsDataTable data = new UnitsDataTable(result);
                if (!data.isError()) sortedArray.add(data);
            }
        }, limit, offset);
        
        return sortedArray.toArray(UnitsDataTable[]::new);
    }
    
    // REPLACED: Now uses high-speed SQL sorting instead of Java QuickSort
    public static UnitsDataTable[] getAllDataSorted(boolean refresh, int dataIndex, DataTableOrder order) throws SQLException {
        String query = BASE_SELECT_QUERY + " ORDER BY " + getColumnName(dataIndex) + " " + order.getString();
        
        ArrayList<UnitsDataTable> sortedArray = new ArrayList<>();
        Database.executePreparedQuery(query, (result) -> {
            while (result.next()) {
                UnitsDataTable data = new UnitsDataTable(result);
                if (!data.isError()) sortedArray.add(data);
            }
        });
        
        return sortedArray.toArray(UnitsDataTable[]::new);
    }
    
    // REPLACED: Purged the old Java BinarySearch and renamed findDataByIdSecure to standard findDataById
    public static UnitsDataTable findDataById(int id) throws SQLException {
        UnitsDataTable[] resultHolder = new UnitsDataTable[1];
        
        Database.executePreparedQuery(BASE_SELECT_QUERY + " WHERE id = ?", (result) -> {
            if (result.next()) {
                resultHolder[0] = new UnitsDataTable(result);
            }
        }, id);
        
        return resultHolder[0];
    }

    // Helper method to safely translate DataTable indexes to SQL columns to prevent injection
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

// CRUD Operations ===========================================================================================
    
    public static void deleteData(int id) {
        try {
            Database.executePrepared("DELETE FROM units WHERE id = ?", id);
        } catch (SQLException e) {
            Console.errorOut("Deleting data from table units error", e);
        }
    }
    
    public static void insertData(UnitsDataTable data) {
        try {
            String query = "INSERT INTO units (tower, floor, unit, model, balcony, floorarea) VALUES (?, ?, ?, ?, ?, ?)";
            Database.executePrepared(query, 
                data.getTower(), data.getFloor(), data.getUnit(), 
                data.getModel(), data.getBalcony(), data.getFloorArea()
            );
        } catch (SQLException e) {
            Console.errorOut("Inserting data from table units error", e);
        }
    }
    
    public static void updateData(UnitsDataTable data, int id) {
        try {
            String query = "UPDATE units SET tower = ?, floor = ?, unit = ?, model = ?, balcony = ?, floorarea = ? WHERE id = ?";
            Database.executePrepared(query, 
                data.getTower(), data.getFloor(), data.getUnit(), 
                data.getModel(), data.getBalcony(), data.getFloorArea(), id 
            );
        } catch (SQLException e) {
            Console.errorOut("Updating data from table units error", e);
        }
    }
}