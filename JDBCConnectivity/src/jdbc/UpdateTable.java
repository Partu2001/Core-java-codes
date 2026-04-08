package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnection;

public class UpdateTable {

    public static void main(String[] args) {

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement()) {

            int rows = stmt.executeUpdate(
                    "update student set sname='Vinit' where id=101");

            if (rows > 0) {
                System.out.println("Data Updated Successfully...");
            } else {
                System.out.println("Wrong Id...");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}