package intern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class db_conn {
	public static void main(String args[]) {
		try {
			// 1.register the driver
			Class.forName("com.mysql.jdbc.Driver");

			// 2.connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/guna", "root", "guna");
			
			System.out.println("Successfuly connected");

			// 3.close the conenction
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
