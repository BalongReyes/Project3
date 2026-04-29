package DatabaseSystem.UnitTenantsData;

import DatabaseSystem.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * UnitTenantsDataHandler manages all database operations (CRUD) 
 * related to Unit Tenants.
 */
public class UnitTenantsDataHandler {

    /**
     * Retrieves all unit tenants by joining the unittenants and residents tables.
     * 
     * @return A List of UnitTenantsDataTable records.
     */
    public List<UnitTenantsDataTable> getAllUnitTenants() {
        List<UnitTenantsDataTable> tenantList = new ArrayList<>();
        
        // SQL Query: Join unittenants with residents, selecting ALL necessary columns
        String query = "SELECT " +
                       "ut.id, ut.residents_id, ut.units_id, ut.weekenders, ut.noactivity, " +
                       "r.lastName, r.firstName, r.middleName, r.autorizedRepresentative, " +
                       "r.birthdate, r.civilStatus, r.gender, r.nationality, r.acrNo, " +
                       "r.employerName, r.profession, r.taxNo, r.created, r.modified, r.mobileNos " +
                       "FROM unittenants ut " +
                       "INNER JOIN residents r ON ut.residents_id = r.id";

        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                // Instantiates the record, firing the ResultSet constructor we just built
                tenantList.add(new UnitTenantsDataTable(rs));
            }

        } catch (SQLException e) {
            System.err.println("Error fetching unit tenants: " + e.getMessage());
            e.printStackTrace();
        }

        return tenantList;
    }
}