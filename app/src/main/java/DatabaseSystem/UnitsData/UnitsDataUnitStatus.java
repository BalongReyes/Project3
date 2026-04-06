
package DatabaseSystem.UnitsData;

public enum UnitsDataUnitStatus{

    Null("Null"),
    
    TurnedOver("Turned Over"),
    UnturnedOver("Unturned Over"),
    Inventory("Inventory");

    private UnitsDataUnitStatus(String stringName){
        this.stringName = stringName;
    }
    
    String stringName;

    public String getStringName(){
        return stringName;
    }
    
}
