package DatabaseSystem.SpouseData;

import DatabaseSystem.Database;
import java.sql.SQLException;

public class SpouseDataHandler {

    private static final String BASE_SELECT_QUERY = "SELECT * FROM spouse";

    public static SpouseDataTable getSpouseByResidentId(int residentId) throws SQLException {
        String query = BASE_SELECT_QUERY + " WHERE residents_id = ? LIMIT 1";
        return Database.queryForObject(query, SpouseDataTable::new, residentId).orElse(null);
    }

}
