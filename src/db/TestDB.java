package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "12345");
	
		
//		//-------------------Insert SQL----------------------
//		
//		// 1.write query
//		String sql = "insert into user(username,password)values('samikshya','pass78') ";
//		
//		// 2. create statement
//		Statement stm = con.createStatement();
//		
//		// 3. execute statement
//		stm.execute(sql);
//		
//		//4. close db
//		con.close();
//		
//		System.out.println("Data Inserted");
//		
//		
//		
//		//---------------------Select SQL-------------------
//		// 1. write query
//		String sql = "select * from user";
//		
//		// 2. Create statement
//		Statement stm = con.createStatement();
//		
//		// 3. Execute statement
//		ResultSet rs = stm.executeQuery(sql);
//		
//		while(rs.next()) {
//			System.out.println("ID: "+ rs.getInt("id"));
//			System.out.println("Username: "+ rs.getString("username"));
//			System.out.println("Password: "+ rs.getString("password"));
//			System.out.println();
//		}
//		
//		//------------------------Update SQL--------------
//		String sql = "Update user set username = 'Ramesh' where username ='Ram'";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		
//		System.out.println("Updated");
//		
		
		//-------------------------DELETE SQL--------------
//		String sql = "Delete from user where id = '6'";
//		Statement stm = con.createStatement();
//		stm.execute(sql);
//		
//		System.out.println("Deleted");
		
		//-------------------------Count SQL----------------
		String sql = "select count(*) from user";
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		
		rs.next();
		int count =  rs.getInt(1);
		System.out.println("Count is: "+count);
		
	}
	
}
