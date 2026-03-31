
package DatabaseSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ConsoleSystem.Console;
import ConsoleSystem.ConsoleColors;
import EventSystem.Interface.ResultExecute;
import java.sql.PreparedStatement;

public class Database {

    protected static String databaseName = "avidadatabase";
    protected static String username = "root";
    protected static String password = "AvidaDatabase101";
    protected static String ip = "localhost";
    protected static String port = "3306";

    private static Connection connection;

    public static void openConnection() {
        Console.line().out("CONNECTING TO DATABASE '" + databaseName + "'", ConsoleColors.GREEN);
        try {
            Console.out("Connecting: " + "jdbc:mysql://" + ip + ":" + port + "/" + databaseName);
            connection = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + databaseName, username,
                    password);
            Console.out("Connection success");
        } catch (SQLException e) {
            Console.errorOut("Connection failed", e);
        }
    }

    public static void closeConnection() {
        if (connection == null)
            return;
        Console.line().out("CLOSING CONNECTION", ConsoleColors.GREEN);
        try {
            connection.close();
            Console.out("Connection closed");
        } catch (SQLException e) {
            Console.errorOut("Connection closing error", e);
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static boolean isOpen() {
        if (connection == null)
            return false;
        try {
            if (connection.isClosed())
                return false;
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    // -----------------------------------------------------------------------------------------------------------

    public static void executeBatch(String... queries) throws SQLException {
        if (connection == null)
            throw new SQLException("Database offline");
        try (
                Statement statement = connection.createStatement();) {
            for (String query : queries) {
                statement.addBatch(query);
            }
            statement.executeBatch();
        }
    }

    public static void execute(String query) throws SQLException {
        if (connection == null)
            throw new SQLException("Database offline");
        try (
                Statement statement = connection.createStatement();) {
            statement.execute(query);
        }
    }

    public static void execute(String query, ResultExecute resultExecute) throws SQLException {
        if (connection == null)
            throw new SQLException("Database offline");
        try (
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(query);) {
            resultExecute.execute(result);
        }
    }

// NEW METHOD: For INSERT, UPDATE, DELETE using Prepared Statements ------------------------------------------
    
    public static void executePrepared(String query, Object... parameters) throws SQLException {
        if (connection == null) throw new SQLException("Database offline");
        
        // The try-with-resources statement automatically closes the PreparedStatement
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Loop through the parameters and set them securely
            for (int i = 0; i < parameters.length; i++) {
                statement.setObject(i + 1, parameters[i]);
            }
            statement.executeUpdate();
        }
    }

    // NEW METHOD: For SELECT queries using Prepared Statements
    public interface PreparedStatementResult {
        void execute(ResultSet result) throws SQLException;
    }

    public static void executePreparedQuery(String query, PreparedStatementResult resultExecute, Object... parameters) throws SQLException {
        if (connection == null) throw new SQLException("Database offline");
        
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            for (int i = 0; i < parameters.length; i++) {
                statement.setObject(i + 1, parameters[i]);
            }
            try (ResultSet result = statement.executeQuery()) {
                resultExecute.execute(result);
            }
        }
    }
    
}
