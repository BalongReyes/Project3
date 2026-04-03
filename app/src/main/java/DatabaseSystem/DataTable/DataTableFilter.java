
package DatabaseSystem.DataTable;

public class DataTableFilter{

    private int dataIndex;
    private String dataWhere;
    private DataTableOrder order;

    public DataTableFilter(int dataIndex, DataTableOrder order){
        this.dataIndex = dataIndex;
        this.order = order;
    }

    public DataTableFilter(int dataIndex, DataTableOrder order, String dataWhere){
        this.dataIndex = dataIndex;
        this.order = order;
        this.dataWhere = dataWhere;
    }

    public int getDataIndex(){
        return dataIndex;
    }

    public String getDataWhere(){
        return dataWhere;
    }

    public DataTableOrder getOrder(){
        return order;
    }

}
