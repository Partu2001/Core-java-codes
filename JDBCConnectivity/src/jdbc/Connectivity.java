package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {
	
	public static void main(String[] args) throws SQLException {
		String url="jdbc:Oracle:thin:@localhost:1521:xe";
		String uname="system";
		String upass="system";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url, uname, upass);
			System.out.println("Connected to database");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
