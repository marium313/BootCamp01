package JDBC_PostgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_CONNECTION {

    private static final String JDBC_URL="jdbc:postgresql://localhost:5432/2024Class";
    private static final String JDBC_USER="postgres";
    private static final String JDBC_PASSWORD="Chickybeebz1";

    public static Connection getConnection() throws SQLException {
        try{
            System.out.println("JDBC_CONNECTION is successfully connected");
            return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
        }catch (SQLException e){
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }

    }

}
