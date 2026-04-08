package jdbc;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBConnection;

public class BatchDemo {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DBConnection.getConnection();
	    Statement stmt=con.createStatement();
		stmt.addBatch("insert into student values(102,'Vinit')");
		stmt.addBatch("insert into student values(103,'Pratik')");
		stmt.addBatch("insert into student values(104,'Partu')");
		stmt.addBatch("insert into student values(105,'Tush')");
		
		stmt.executeBatch();
		System.out.println("Data inserted intp batch.....");
		// TODO Auto-generated method stub

	}

}
