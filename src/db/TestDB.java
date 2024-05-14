package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//get Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "12345");
	
		
		//-------------------Insert SQL----------------------
		
		// 1.write query
		String sql = "insert into user(username,password)values('samikshya','pass78') ";
		
		// 2. create statement
		Statement stm = con.createStatement();
		
		// 3. execute statement
		stm.execute(sql);
		
		//4. close db
		con.close();
		
		System.out.println("Data Inserted");
		
		
		
		//---------------------Select SQL-------------------
		// 1. write query
		// 2. Create statement
		// 3. Execute statement
		
	}
}
