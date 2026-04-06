
package DatabaseSystem.UnitsData;

import DatabaseSystem.DataTable.DataTable;
import DatabaseSystem.DataTable.DataTableType;
import MethodsSystem.MethodString;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Holds the values of the table items
 * @author SEDIAN
 */
public class UnitsDataTable implements DataTable{
    
    public static final int ID = 1;
    public static final int TOWER = 2;
    public static final int FLOOR = 3;
    public static final int UNIT = 4;
    public static final int MODEL = 5;
    public static final int BALCONY = 6;
    public static final int FLOOR_AREA = 7;
    
    public static final int OCCUPANCY = 8;
    public static final int UNIT_STATUS = 9;
    
// -----------------------------------------------------------------------------------------------------------
    
    private Integer id;
    private Integer tower;
    private Integer floor;
    private Integer unit;
    private Integer model;
    private Integer balcony;
    private Float floorArea;
    
    private UnitsDataOccupancy occupancy;
    private UnitsDataUnitStatus unitStatus;
    
// Constructor ===============================================================================================

    public UnitsDataTable(Integer id, Integer tower, Integer floor, Integer unit, Integer model, Integer balcony, Float floorArea, UnitsDataOccupancy occupancy, UnitsDataUnitStatus unitStatus) {
        this.id = id;
        this.tower = tower;
        this.floor = floor;
        this.unit = unit;
        this.model = model;
        this.balcony = balcony;
        this.floorArea = floorArea;
        this.occupancy = occupancy;
        this.unitStatus = unitStatus;
    }

    public UnitsDataTable(ResultSet results) throws SQLException {
        try {
            id = results.getInt("id");
            tower = results.getInt("tower");
            floor = results.getInt("floor");
            unit = results.getInt("unit");
            model = results.getInt("model");
            balcony = results.getInt("balcony");
            floorArea = results.getFloat("floorArea");
            
            // Check for Owner and Tenant logic dynamically injected from SQL
            boolean hasOwner = false;
            boolean hasTenant = false;
            
            // Wrapped in try-catch in case a standard `SELECT * FROM units` is executed elsewhere
            try {
                hasOwner = results.getBoolean("has_owner");
                hasTenant = results.getBoolean("has_tenant");
            } catch (SQLException ignored) {
                // If columns don't exist, we fall back to defaults
            }
            
            // Set Unit Status
            if (hasOwner) {
                unitStatus = UnitsDataUnitStatus.TurnedOver;
            } else {
                unitStatus = UnitsDataUnitStatus.UnturnedOver;
            }
            
            // Set Occupancy Type
            if (hasTenant) {
                occupancy = UnitsDataOccupancy.Tenant;
            } else if (hasOwner) {
                occupancy = UnitsDataOccupancy.Owner;
            } else {
                occupancy = UnitsDataOccupancy.UnturnedOver;
            }
            
        } catch(SQLException e) {
            error = true;
            throw e;
        }
    }

// Error =====================================================================================================
    
    private boolean error = false;
    
    public boolean isError(){
        return error;
    }
    
// Methods ===================================================================================================

    public boolean haveData(String data){
        return 
            MethodString.checkLike(tower, data) ||
            MethodString.checkLike(floor, data) ||
            MethodString.checkLike(unit, data) ||
            MethodString.checkLike(model, data);
    }
    
    public boolean idEquals(Integer value){
        if(id != null && value != null){
            return id.equals(value);
        }
        return false;
    }
    
// Getter ====================================================================================================
    
    @Override
    public Object getData(int i){
        return switch(i){
            case 1 -> id;
            case 2 -> tower;
            case 3 -> floor;
            case 4 -> unit;
            case 5 -> model;
            case 6 -> balcony;
            case 7 -> floorArea;
            case 8 -> occupancy != null ? occupancy.getStringName() : "";
            case 9 -> unitStatus != null ? unitStatus.getStringName() : "";
            default -> null;
        };
    }
    
    @Override
    public DataTableType getDataType(int i){
        return switch(i){
            case 1, 2, 3, 4, 5, 6 -> DataTableType.TYPE_INTEGER;
            case 7 -> DataTableType.TYPE_FLOAT;
            case 8, 9 -> DataTableType.TYPE_STRING;
            default -> DataTableType.TYPE_NULL;
        };
    }
    
    public Integer getId(){
        return id;
    }

    public Integer getTower(){
        return tower;
    }

    public Integer getFloor(){
        return floor;
    }

    public Integer getUnit(){
        return unit;
    }

    public Integer getModel(){
        return model;
    }

    public Integer getBalcony(){
        return balcony;
    }

    public Float getFloorArea(){
        return floorArea;
    }
    
    public UnitsDataOccupancy getOccupancy(){
        return occupancy;
    }
    
    public UnitsDataUnitStatus getUnitStatus(){
        return unitStatus;
    }

// Overrided Methods =========================================================================================

    @Override
    public String toString(){
        return tower + " " + floor + " " + unit;
    }
    
}
