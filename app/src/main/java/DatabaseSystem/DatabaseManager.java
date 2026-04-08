package DatabaseSystem;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DatabaseManager {

    private static HikariDataSource dataSource;

    // Static block initializes the connection pool when the application starts
    static {
        HikariConfig config = new HikariConfig();
        
        // Modern practice: Read credentials from System Environment Variables
        String ip = System.getenv().getOrDefault("DB_HOST", "localhost");
        String port = System.getenv().getOrDefault("DB_PORT", "3306");
        String dbName = System.getenv().getOrDefault("DB_NAME", "avidadatabase");
        
        config.setJdbcUrl("jdbc:mysql://" + ip + ":" + port + "/" + dbName);
        config.setUsername(System.getenv().getOrDefault("DB_USER", "root"));
        config.setPassword(System.getenv().getOrDefault("DB_PASS", "AvidaDatabase101"));

        // Connection Pool Settings
        config.setMaximumPoolSize(10);     // Max concurrent connections
        config.setMinimumIdle(2);          // Minimum connections kept alive
        config.setIdleTimeout(30000);      // Close idle connections after 30s
        config.setConnectionTimeout(10000); // Timeout if DB is offline

        dataSource = new HikariDataSource(config);
    }

    /**
     * Gets a connection from the pool.
     * MUST be used in a try-with-resources block so it is returned to the pool.
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * Call this only when the application is shutting down.
     */
    public static void closePool() {
        if (dataSource != null && !dataSource.isClosed()) {
            dataSource.close();
        }
    }
}