package DatabaseSystem.DataTable;

public record DataTableFilter(
        
    int dataIndex,
    DataTableOrder order,
    String dataWhere
        
){
    
    // Overloaded constructor for when 'dataWhere' is not needed
    public DataTableFilter(int dataIndex, DataTableOrder order) {
        this(dataIndex, order, null);
    }
    
}