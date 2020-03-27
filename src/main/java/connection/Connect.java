package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/jdbc_example";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    public static Connection getConnect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
