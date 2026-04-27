package DatabaseSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import ConsoleSystem.Console;
import ConsoleSystem.ConsoleColors;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;

public class Database {

    private static HikariDataSource dataSource;

    public static void openConnection() {
        try {
            Dotenv dotenv = Dotenv.configure().load();

            // Required — will throw if missing
            String dbPassword = getRequired(dotenv, "DB_PASSWORD");
            String dbName = getRequired(dotenv, "DB_NAME");
            String dbUser = getRequired(dotenv, "DB_USER");
            String dbIp   = getRequired(dotenv, "DB_HOST");
            String dbPort = getRequired(dotenv, "DB_PORT");

            Console.line().out("INITIALIZING CONNECTION POOL FOR '" + dbName + "'", ConsoleColors.GREEN);

            HikariConfig config = new HikariConfig();
            config.setJdbcUrl("jdbc:mysql://" + dbIp + ":" + dbPort + "/" + dbName);
            config.setUsername(dbUser);
            config.setPassword(dbPassword);

            // Recommended HikariCP Performance Settings for MySQL
            config.addDataSourceProperty("cachePrepStmts",          "true");
            config.addDataSourceProperty("prepStmtCacheSize",        "250");
            config.addDataSourceProperty("prepStmtCacheSqlLimit",    "2048");
            config.addDataSourceProperty("useServerPrepStmts",       "true");
            config.addDataSourceProperty("useLocalSessionState",     "true");
            config.addDataSourceProperty("rewriteBatchedStatements", "true");
            config.addDataSourceProperty("cacheResultSetMetadata",   "true");
            config.addDataSourceProperty("cacheServerConfiguration", "true");
            config.addDataSourceProperty("elideSetAutoCommits",      "true");
            config.addDataSourceProperty("maintainTimeStats",        "false");

            // Pool Size Configuration
            config.setMaximumPoolSize(10);
            config.setMinimumIdle(2);
            config.setIdleTimeout(30000);
            config.setConnectionTimeout(10000);

            dataSource = new HikariDataSource(config);
            Console.out("Connection pool initialized successfully");

        } catch (DotenvException | IllegalStateException e) {
            Console.errorOut("Connection pool initialization failed", e);
        }
    }

    /** Reads a required .env key — throws if missing or blank. */
    private static String getRequired(Dotenv dotenv, String key) {
        String value = dotenv.get(key);
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalStateException("'" + key + "' is not set or empty in the .env file.");
        }
        return value;
    }

    /** Reads an optional .env key — returns the defaultValue if missing or blank. */
    private static String getOptional(Dotenv dotenv, String key, String defaultValue) {
        String value = dotenv.get(key);
        return (value != null && !value.trim().isEmpty()) ? value : defaultValue;
    }

    public static void closeConnection() {
        if (dataSource != null && !dataSource.isClosed()) {
            Console.line().out("CLOSING CONNECTION POOL", ConsoleColors.GREEN);
            dataSource.close();
            Console.out("Connection pool closed");
        }
    }

    // Fetches a connection from the pool. Callers must call close() on this connection to return it!
    public static Connection getConnection() throws SQLException {
        if (dataSource == null) {
            throw new SQLException("DataSource is not initialized.");
        }
        return dataSource.getConnection();
    }

    public static boolean isOpen() {
        return dataSource != null && !dataSource.isClosed() && dataSource.isRunning();
    }

// Secure Methods for INSERT, UPDATE, DELETE =================================================================
    
    public static void executePrepared(String query, Object... parameters) throws SQLException {
        if (dataSource == null) throw new SQLException("Database offline");
        
        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            for (int i = 0; i < parameters.length; i++) {
                statement.setObject(i + 1, parameters[i]);
            }
            statement.executeUpdate();
        }
    }

    public interface PreparedStatementResult {
        void execute(ResultSet result) throws SQLException;
    }

    public static void executePreparedQuery(String query, PreparedStatementResult resultExecute, Object... parameters) throws SQLException {
        if (dataSource == null) throw new SQLException("Database offline");
        
        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            for (int i = 0; i < parameters.length; i++) {
                statement.setObject(i + 1, parameters[i]);
            }
            try (ResultSet result = statement.executeQuery()) {
                resultExecute.execute(result);
            }
        }
    }

// Modern Generic Data Access Methods ========================================================================

    public interface RowMapper<T> {
        T map(ResultSet rs) throws SQLException;
    }

    public static <T> List<T> queryForList(String query, RowMapper<T> mapper, Object... parameters) throws SQLException {
        if (dataSource == null) throw new SQLException("Database offline");
        
        List<T> results = new ArrayList<>();
        try (Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)) {
            for (int i = 0; i < parameters.length; i++) {
                statement.setObject(i + 1, parameters[i]);
            }
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    results.add(mapper.map(rs));
                }
            }
        }
        return results;
    }

    public static <T> Optional<T> queryForObject(String query, RowMapper<T> mapper, Object... parameters) throws SQLException {
        if (dataSource == null) throw new SQLException("Database offline");
        
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            for (int i = 0; i < parameters.length; i++) {
                statement.setObject(i + 1, parameters[i]);
            }
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return Optional.ofNullable(mapper.map(rs));
                }
            }
        }
        return Optional.empty();
    }

// Modern Transaction Management =============================================================================

    public interface TransactionCallback<T> {
        T execute(Connection conn) throws SQLException;
    }

    public static <T> T executeTransaction(TransactionCallback<T> callback) throws SQLException {
        if (dataSource == null) throw new SQLException("Database offline");
        
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            try {
                T result = callback.execute(conn);
                conn.commit();
                return result;
            } catch (SQLException e) {
                conn.rollback();
                throw e;
            } finally {
                conn.setAutoCommit(true);
            }
        }
    }
}