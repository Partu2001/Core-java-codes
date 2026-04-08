package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnection;

public class InsertTable {

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();

            int rows = stmt.executeUpdate("insert into student values (101, 'Partu')");
            
            if (rows > 0) {
                System.out.println("Data inserted successfully...");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}