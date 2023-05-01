package homework9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
    public static final String CONNECTION_STRING ="jdbc::sqlserver//XPGETBIW0912//SQLEXPRESS; encrypt=false; username=test;password=test;database=Greenhouse";

    public static Connection conn;

    public static void registerDriver() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver is not found");
        }
        System.out.println("Driver is registered");
    }

    private static Connection create() {
        registerDriver();
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.err.println("Not connected");
        }
        return conn;
    }

    public static Connection getConnection() {
        if (conn == null) {
            return create();
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                System.err.println("Error while closing the connection");
            }
        }
    }
}