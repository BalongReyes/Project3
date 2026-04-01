
package DatabaseSystem.DataTable;

public class DataTableOrderFilter{

    private int dataIndex;
    private DataTableOrder order;

    public DataTableOrderFilter(int dataIndex, DataTableOrder order){
        this.dataIndex = dataIndex;
        this.order = order;
    }

    public int getDataIndex(){
        return dataIndex;
    }

    public DataTableOrder getOrder(){
        return order;
    }

}
