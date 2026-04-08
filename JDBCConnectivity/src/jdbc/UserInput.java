package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import util.DBConnection;

public class UserInput {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		Connection con=DBConnection.getConnection();
		
		int choice;
		
		do {
			System.out.println("1.Insert Data");
			System.out.println("2.Update Data");
			System.out.println("3.Delete Data");
			System.out.println("4.Fetch Data");
			System.out.println("5.Exit");
			
			System.out.println("Enter Choice:");
			choice=sc.nextInt();
			
			
			switch(choice) {
			case 1:
				con.setAutoCommit(false);
				String query="insert into student values(?,?)";
				PreparedStatement stmt=con.prepareStatement(query);
				
				System.out.println("Enter Student ID:");
				int sid=sc.nextInt();
				System.out.println("Enter Student Name:");
				String sname=sc.next();
				
				stmt.setInt(1, sid);
				stmt.setString(2, sname);
				
				stmt.execute();
				
				con.commit();
				System.out.println("Data inserted....");
				break;
				
			case 2:
				con.setAutoCommit(false);
				String query2="update student set sname=? where id=?";
				PreparedStatement stmt1=con.prepareStatement(query2);
				
				System.out.println("Enter Student ID:");
				int sid1=sc.nextInt();
				System.out.println("Enter Student Name:");
				String sname1=sc.next();
				
				stmt1.setInt(2,sid1);
				stmt1.setString(1, sname1);
				
				stmt1.execute();
				
				con.commit();
				System.out.println("Data Updated....");
				break;
				
			case 3:
				con.setAutoCommit(false);
				String query3="delete from student where id=?";
				PreparedStatement stmt2=con.prepareStatement(query3);
				
				System.out.println("Enter Student ID:");
				int sid3=sc.nextInt();
				
				
				stmt2.setInt(1,sid3);
				
				stmt2.execute();
				
				con.commit();
				System.out.println("Data Deleted....");
				break;
				
			case 4:
				con.setAutoCommit(false);
				String query4="select * from student where id=?";
				PreparedStatement stmt3=con.prepareStatement(query4);
				System.out.println("Enter Id:");
				int searchid=sc.nextInt();
				stmt3.setInt(1, searchid);
				ResultSet rs=stmt3.executeQuery();
				
				while(rs.next()) {
					System.out.println(rs.getInt(1) + " " +rs.getString(2));
				}
					
				break;
				
			case 5:
					System.out.println("Exit");
					break;
					
			default :
				System.out.println("Invalid choice");
				}
			}while(choice!=5);
			
		
	}

}
