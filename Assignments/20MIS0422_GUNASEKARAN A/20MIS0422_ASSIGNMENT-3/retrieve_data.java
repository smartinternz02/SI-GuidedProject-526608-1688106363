package intern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class retrieve_data {
	public static void main(String args[]) {
		try {
			// 1.register the driver
			Class.forName("com.mysql.jdbc.Driver");

			// 2.connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/guna", "root", "guna");

			// 3.Statement
			Statement stmt = conn.createStatement();

			// 4.Execute query
			ResultSet rs = stmt.executeQuery("select * from students");

			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+ " "+rs.getString(6));
			}

			// 5.close the conenction
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
