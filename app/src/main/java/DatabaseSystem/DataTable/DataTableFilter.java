
package DatabaseSystem.DataTable;

public class DataTableFilter{

    private int dataIndex;
    private DataTableOrder order;

    public DataTableFilter(int dataIndex, DataTableOrder order){
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
