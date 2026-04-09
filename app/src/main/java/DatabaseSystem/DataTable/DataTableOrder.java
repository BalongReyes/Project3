package DatabaseSystem.DataTable;

public enum DataTableOrder {
    
    DESC("Desc"), 
    ASC("Asc"), 
    WHERE("Where");
    
    private final String value;
    
    DataTableOrder(String value) {
        this.value = value;
    }

    public String getString() {
        return value;
    }
    
}