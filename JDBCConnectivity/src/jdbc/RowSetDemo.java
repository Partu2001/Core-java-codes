package jdbc;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {

	public static void main(String[] args) throws SQLException {
		JdbcRowSet j=RowSetProvider.newFactory().createJdbcRowSet();
		j.setUrl("jdbc:Oracle:thin:@localhost:1521:xe");
		j.setPassword("system");
		j.setUsername("system");
		
		System.out.println("Connected....");
		
		j.setCommand("select * from stud");
		j.execute();
		while(j.next()) {
			System.out.println(j.getInt(1) + " " + j.getString(2)) ;
		}
		
//		j.setCommand("insert into stud values(?,?)");
//		j.setInt(1, 14);
//		j.setString(2, "Pk");
//		j.execute();
//		System.out.println("Inserted...");
//		
		
//		j.setCommand("delete from stud where id=?");
//		j.setInt(1, 11);
		
		
//		j.execute();
//		System.out.println("Deleted....");
//		
//		j.setCommand("update stud set sname='Prathmesh' where id=?");
//		j.setInt(1, 11);
//		j.execute();
//		System.out.println("Updateddd...");
		// TODO Auto-generated method stub

	}

}
