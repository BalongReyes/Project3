package DatabaseSystem.EmergencyContactData;

import DatabaseSystem.Database;
import java.sql.SQLException;
import java.util.List;

public class EmergencyContactDataHandler {

    private static final String BASE_SELECT_QUERY = "SELECT * FROM emergencycontact";

    public static List<EmergencyContactDataTable> getContactsByResidentId(int residentId) throws SQLException {
        String query = BASE_SELECT_QUERY + " WHERE residents_id = ?";
        return Database.queryForList(query, EmergencyContactDataTable::new, residentId);
    }

}
