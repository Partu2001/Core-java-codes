package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnection;

public class BatchDemo1 {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DBConnection.getConnection();
		PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?)");
		
		pstmt.setInt(1, 106);
		pstmt.setString(2,"PK");
		pstmt.addBatch();
		
		pstmt.setInt(1, 107);
		pstmt.setString(2,"PSK");
		pstmt.addBatch();
		
		pstmt.executeBatch();
		System.out.println("Data inserted...");
		// TODO Auto-generated method stub

	}

}
