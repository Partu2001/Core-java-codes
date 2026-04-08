package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import util.DBConnection;

public class FetchData {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		Connection con=DBConnection.getConnection();
		con.setAutoCommit(false);
		String query="select * from student where id=?";
		PreparedStatement stmt=con.prepareStatement(query);
		System.out.println("Enter Id:");
		int searchid=sc.nextInt();
		stmt.setInt(1, searchid);
		ResultSet rs=stmt.executeQuery();
		
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " +rs.getString(2));
		}
		
		// TODO Auto-generated method stub

	}

}
