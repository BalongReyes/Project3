
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

// ===========================================================================================================
    
    public static void deleteData(int id){
        try{
            Database.execute(
                "DELETE FROM units WHERE id = '" + id + "'"
            );
        }catch(SQLException e){
            Console.errorOut("Deleting data from table items error", e);
        }
    }
    
    public static void insertData(UnitsDataTable data){
        try{
            Database.execute(
                "INSERT INTO units (id, tower, floor, unit, model, balcony, floorarea) VALUES ("
                + "NULL"
                + ", '" + data.getTower() + "'"
                + ", '" + data.getFloor() + "'"
                + ", '" + data.getUnit() + "'"
                + ", '" + data.getModel() + "'"
                + ", '" + data.getBalcony() + "'"
                + ", '" + data.getFloorArea() + "'"
                + ")"
            );
        }catch(SQLException e){
            Console.errorOut("Inserting data from table units error", e);
        }
    }
    
    public static void updateData(UnitsDataTable data, int id){
        try{
            Database.execute(
                "UPDATE items SET "
                + "tower = '" + data.getTower() + "'"
                + ", floor = '" + data.getFloor() + "'"
                + ", unit = '" + data.getUnit() + "'"
                + ", model = '" + data.getModel() + "'"
                + ", balcony = '" + data.getBalcony() + "'"
                + ", floorarea = " + data.getFloorArea() + "'"
                + " WHERE id = " + id
            );
        }catch(SQLException e){
            Console.errorOut("Updating data from table units error", e);
        }
    }
    
}
