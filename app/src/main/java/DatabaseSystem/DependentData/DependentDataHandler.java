package DatabaseSystem.DependentData;

import DatabaseSystem.Database;
import java.sql.SQLException;
import java.util.List;

public class DependentDataHandler {

    private static final String BASE_SELECT_QUERY = "SELECT * FROM dependents";

    public static List<DependentDataTable> getDependentsByResidentId(int residentId) throws SQLException {
        String query = BASE_SELECT_QUERY + " WHERE residents_id = ?";
        return Database.queryForList(query, DependentDataTable::new, residentId);
    }

}
