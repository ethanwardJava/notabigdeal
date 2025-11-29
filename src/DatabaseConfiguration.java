import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {
    DriverManager manager = (DriverManager) DriverManager.getConnection("");

    public DatabaseConfiguration() throws SQLException {
    }
}
