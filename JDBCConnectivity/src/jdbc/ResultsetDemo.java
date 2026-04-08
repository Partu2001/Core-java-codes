package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnection;

public class ResultsetDemo {
    public static void main(String[] args) {

        Connection con = DBConnection.getConnection();
        Statement pstm;
        try {
            pstm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet re = pstm.executeQuery("select * from stud");
            System.out.println("Student data is...");

            while(re.next()){
                System.out.println(re.getInt(1) + " " + re.getString(2));
            }
            
            while(re.previous()){
                System.out.println(re.getInt(1) + " " + re.getString(2));
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
       }
    }
}