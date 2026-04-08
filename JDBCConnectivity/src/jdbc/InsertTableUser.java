package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import util.DBConnection;

public class InsertTableUser {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		Connection con=DBConnection.getConnection();
		con.setAutoCommit(false);
		String query="insert into student values(?,?)";
		PreparedStatement stmt=con.prepareStatement(query);
		
		System.out.println("Enter Student ID:");
		int sid=sc.nextInt();
		System.out.println("Enter Student Name:");
		String sname=sc.next();
		
		stmt.setInt(1, 101);
		stmt.setString(2, sname);
		
		stmt.execute();
		
		con.commit();
		System.out.println("Data inserted....");
	}

}
