package DatabaseSystem.DataTable;

public record DataTableFilter(
        
    int dataIndex,
    DataTableOrder order,
    String dataWhere
        
){
    
    public DataTableFilter(int dataIndex, DataTableOrder order) {
        this(dataIndex, order, null);
    }
    
}