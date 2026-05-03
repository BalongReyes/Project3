package DatabaseSystem.PersonStayingData;

import DatabaseSystem.Database;
import java.sql.SQLException;
import java.util.List;

public class PersonStayingDataHandler {

    private static final String BASE_SELECT_QUERY = "SELECT * FROM personstaying";

    public static List<PersonStayingDataTable> getPersonsStayingByResidentId(int residentId) throws SQLException {
        String query = BASE_SELECT_QUERY + " WHERE residents_id = ?";
        return Database.queryForList(query, PersonStayingDataTable::new, residentId);
    }

}
