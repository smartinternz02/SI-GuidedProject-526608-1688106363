package intern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insert_data {
	public static void main(String args[]) {
		try {
			// 1.register the driver
			Class.forName("com.mysql.jdbc.Driver");

			// 2.connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/guna", "root", "guna");

			// 3.Statement
			Statement stmt = conn.createStatement();

			// 4.Execute query
			int rs = stmt.executeUpdate("insert into students(StudentId,SName,Dept,Year,Campus,Gender) values(107,'ram','CSE','3','VIT-AP','male')");

			if (rs > 0)
				System.out.println("successfully inserted");
	  
	        else
	        	System.out.println("unsucessful insertion ");

			// 5.close the conenction
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
