package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String uname = "system";
        String upass = "system";

        try (Connection con = DriverManager.getConnection(url, uname, upass);
             Statement stmt = con.createStatement()) {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            con.setAutoCommit(false);

            System.out.println("Connected to database");

            // Drop table if exists
            try {
                stmt.executeUpdate("Drop Table student");
                System.out.println("Old table dropped");
            } catch (SQLException e) {
                System.out.println("Table does not exist, creating new one...");
            }

            // Create table
            stmt.executeUpdate(
                    "create table student (id number primary key, sname varchar2(20))");

            con.commit();  // Important

            System.out.println("Table created successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}