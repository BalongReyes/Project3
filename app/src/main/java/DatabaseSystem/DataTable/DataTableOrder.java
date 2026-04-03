
package DatabaseSystem.DataTable;

public enum DataTableOrder{
    
    Desc("Desc"), Asc("Asc"), Where("Where");
    
    String s;
    
    private DataTableOrder(String s){
        this.s = s;
    }

    public String getString(){
        return s;
    }
    
}
