package DatabaseSystem.UnitsData;

import DatabaseSystem.DataTable.DataTable;
import DatabaseSystem.DataTable.DataTableType;
import MethodsSystem.MethodString;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public record UnitsDataTable(
        
    Integer id,
    String tower,
    int floor,
    int unit,
    int model,
    int balcony,
    float floorArea,
    
    int status,
    Date turnedOver,
    String accountNumber,
    
    boolean hasOwner,
    boolean hasTenant,
    boolean isOwnerWeekender,
    boolean isTenantWeekender,
    boolean isOwnerNoActivity,
    boolean isTenantNoActivity
        
) implements DataTable {

    public static final int ID = 1;
    public static final int TOWER = 2;
    public static final int FLOOR = 3;
    public static final int UNIT = 4;
    public static final int MODEL = 5;
    public static final int BALCONY = 6;
    public static final int FLOOR_AREA = 7;
    public static final int STATUS = 8;
    public static final int TURNED_OVER = 9;
    public static final int ACCOUNT_NUMBER = 10;

    public UnitsDataTable(ResultSet results) throws SQLException {
        this(
            results.getInt("id"),
            results.getString("tower"),
            results.getInt("floor"),
            results.getInt("unit"),
            results.getInt("model"),
            results.getInt("balcony"),
            results.getFloat("floorarea"),
            
            results.getInt("status"),
            results.getDate("turnedOver"),
            results.getString("accountnumber"),
            
            results.getBoolean("has_owner"),
            results.getBoolean("has_tenant"),
            results.getBoolean("is_owner_weekender"),
            results.getBoolean("is_tenant_weekender"),
            results.getBoolean("is_owner_no_activity"),
            results.getBoolean("is_tenant_no_activity")
        );
    }

    public boolean haveData(String data) {
        return MethodString.checkLike(tower, data) || 
               MethodString.checkLike(String.valueOf(floor), data) || 
               MethodString.checkLike(unit, data);
    }

    @Override
    public Object getData(int i) {
        return switch (i) {
            case ID -> id;
            case TOWER -> tower;
            case FLOOR -> floor;
            case UNIT -> unit;
            case MODEL -> model;
            case BALCONY -> balcony;
            case FLOOR_AREA -> floorArea;
            case STATUS -> status;
            case TURNED_OVER -> turnedOver;
            case ACCOUNT_NUMBER -> accountNumber;
            default -> null;
        };
    }

    @Override
    public DataTableType getDataType(int i) {
        return switch (i) {
            case TOWER, UNIT, MODEL, BALCONY, ACCOUNT_NUMBER -> DataTableType.TYPE_STRING;
            case ID, FLOOR, STATUS -> DataTableType.TYPE_INTEGER;
            case TURNED_OVER -> DataTableType.TYPE_DATE;
            case FLOOR_AREA -> DataTableType.TYPE_FLOAT;
            default -> DataTableType.TYPE_NULL;
        };
    }
    
    public UnitsDataOccupancy getOccupancy(){
        if (hasTenant) {
            if(isTenantWeekender){
                return UnitsDataOccupancy.TenantWeekenders;
            }else if(isTenantNoActivity){
                return UnitsDataOccupancy.TenantNoActivity;
            }else{
                return UnitsDataOccupancy.Tenant;
            }
        } else if (hasOwner) {
            if(isOwnerWeekender){
                return UnitsDataOccupancy.OwnerWeekenders;
            }else if(isOwnerNoActivity){
                return UnitsDataOccupancy.OwnerNoActivity;
            }else{
                return UnitsDataOccupancy.Owner;
            }
        } else {
            return UnitsDataOccupancy.UnturnedOver;
        }
    }
    
    public UnitsDataUnitStatus getUnitStatus(){
        if (hasOwner) {
            return UnitsDataUnitStatus.TurnedOver;
        } else {
            return UnitsDataUnitStatus.UnturnedOver;
        }
    }
}