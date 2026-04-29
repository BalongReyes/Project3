package DatabaseSystem.UnitOwnersData;

import DatabaseSystem.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UnitOwnersDataHandler {

    public List<UnitOwnersDataTable> getAllUnitOwners() {
        List<UnitOwnersDataTable> ownerList = new ArrayList<>();
        
        // SQL Query: Join unitowners with residents, selecting ALL necessary columns
        String query = "SELECT " +
                       "uo.id, uo.residents_id, uo.units_id, uo.weekenders, uo.noactivity, " +
                       "r.lastName, r.firstName, r.middleName, r.autorizedRepresentative, " +
                       "r.birthdate, r.civilStatus, r.gender, r.nationality, r.acrNo, " +
                       "r.employerName, r.profession, r.taxNo, r.created, r.modified, r.mobileNos " +
                       "FROM unitowners uo " +
                       "INNER JOIN residents r ON uo.residents_id = r.id";

        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                // Instantiates the record, firing the ResultSet constructor we just built
                ownerList.add(new UnitOwnersDataTable(rs));
            }

        } catch (SQLException e) {
            System.err.println("Error fetching unit owners: " + e.getMessage());
            e.printStackTrace();
        }

        return ownerList;
    }
}