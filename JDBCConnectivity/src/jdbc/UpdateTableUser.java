package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import util.DBConnection;

public class UpdateTableUser {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		Connection con=DBConnection.getConnection();
		con.setAutoCommit(false);
		String query="update student set sname=? where id=?";
		PreparedStatement stmt=con.prepareStatement(query);
		
		System.out.println("Enter Student ID:");
		int sid=sc.nextInt();
		System.out.println("Enter Student Name:");
		String sname=sc.next();
		
		stmt.setInt(2,sid);
		stmt.setString(1, sname);
		
		stmt.execute();
		
		con.commit();
		System.out.println("Data Updated....");
		// TODO Auto-generated method stub

	}

}
