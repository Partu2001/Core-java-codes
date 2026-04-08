package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import util.DBConnection;

public class DeleteTableUser {

	public static void main(String[] args) throws SQLException {
		

		Scanner sc=new Scanner(System.in);
		Connection con=DBConnection.getConnection();
		con.setAutoCommit(false);
		String query="delete from student where id=?";
		PreparedStatement stmt=con.prepareStatement(query);
		
		System.out.println("Enter Student ID:");
		int sid=sc.nextInt();
		
		
		stmt.setInt(1,sid);
		
		stmt.execute();
		
		con.commit();
		System.out.println("Data Deleted....");
		// TODO Auto-generated method stub

	}

}
