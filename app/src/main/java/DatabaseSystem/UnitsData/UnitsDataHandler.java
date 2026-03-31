
package DatabaseSystem.UnitsData;

import ConsoleSystem.Console;
import ConsoleSystem.ConsoleColors;
import DatabaseSystem.DataTable.DataTableOrder;
import DatabaseSystem.Database;
import MainSystem.Main;
import MethodsSystem.MethodAlgorithms;
import java.sql.SQLException;
import java.util.ArrayList;

public class UnitsDataHandler{

    private static ArrayList<UnitsDataTable> array = new ArrayList<>();
    
    public static void refreshData() throws SQLException{
        array.clear();
        
        Database.execute("SELECT * FROM units", (result) -> {
            while(result.next()){
                UnitsDataTable data = new UnitsDataTable(result);
                if(!data.isError()) array.add(data);
            }
        });
        
        if(Main.debugDataHandlerRefresh) Console.out("UnitsDataHandler refreshed", ConsoleColors.YELLOW);
    }
    
    public static UnitsDataTable[] getAllData(boolean refresh) throws SQLException{
        if(refresh || array.isEmpty()) refreshData();
        return array.toArray(UnitsDataTable[]::new);
    }
    
    public static UnitsDataTable[] getAllDataSorted(boolean refresh, int dataIndex, DataTableOrder order) throws SQLException{
        UnitsDataTable[] currentArray = getAllData(refresh);
        
        MethodAlgorithms.initQuickSort(currentArray, dataIndex, order);
        return currentArray;
    }
    
    public static UnitsDataTable findDataById(int id, boolean refresh) throws SQLException{
        UnitsDataTable[] currentArray = getAllData(refresh);
        
        int index = MethodAlgorithms.initBinarySearch(currentArray, UnitsDataTable.ID, id);
        return index != -1 ? currentArray[index] : null;
    }
    
    // Example of a fast, database-level search in UnitsDataHandler
    public static UnitsDataTable findDataByIdSecure(int id) throws SQLException {
        UnitsDataTable[] resultHolder = new UnitsDataTable[1];
        
        Database.executePreparedQuery("SELECT * FROM units WHERE id = ?", (result) -> {
            if (result.next()) {
                resultHolder[0] = new UnitsDataTable(result);
            }
        }, id);
        
        return resultHolder[0];
    }

// ===========================================================================================================
    
    public static void deleteData(int id) {
        try {
            // Secure deletion
            Database.executePrepared("DELETE FROM units WHERE id = ?", id);
        } catch (SQLException e) {
            Console.errorOut("Deleting data from table units error", e);
        }
    }
    
    public static void insertData(UnitsDataTable data) {
        try {
            // Use ? placeholders instead of string concatenation
            String query = "INSERT INTO units (tower, floor, unit, model, balcony, floorarea) VALUES (?, ?, ?, ?, ?, ?)";
            
            Database.executePrepared(query, 
                data.getTower(), 
                data.getFloor(), 
                data.getUnit(), 
                data.getModel(), 
                data.getBalcony(), 
                data.getFloorArea()
            );
        } catch (SQLException e) {
            Console.errorOut("Inserting data from table units error", e);
        }
    }
    
    public static void updateData(UnitsDataTable data, int id) {
        try {
            // Note: Your original code said "UPDATE items", I changed it to "units"
            String query = "UPDATE units SET tower = ?, floor = ?, unit = ?, model = ?, balcony = ?, floorarea = ? WHERE id = ?";
            
            Database.executePrepared(query, 
                data.getTower(), 
                data.getFloor(), 
                data.getUnit(), 
                data.getModel(), 
                data.getBalcony(), 
                data.getFloorArea(),
                id // The WHERE clause parameter
            );
        } catch (SQLException e) {
            Console.errorOut("Updating data from table units error", e);
        }
    }
    
}
