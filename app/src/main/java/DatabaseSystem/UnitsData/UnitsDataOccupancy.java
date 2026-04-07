
package DatabaseSystem.UnitsData;

public enum UnitsDataOccupancy{

    Null("Null"),
    
    Owner("Owner"),
    Tenant("Tenant"),
    Inventory("Inventory"),
    NoActivity("No Activity"),
    UnturnedOver("Unturned Over"),
    OwnerWeekenders("Owner - Weekenders"),
    TenantWeekenders("Tenant - Weekenders"),
    OwnerNoActivity("Owner - No Activity"),
    TenantNoActivity("Tenant - No Activity");
    
    private UnitsDataOccupancy(String stringName){
        this.stringName = stringName;
    }
    
    String stringName;

    public String getStringName(){
        return stringName;
    }

}
