import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//JDBC retrieve data from MYSQL workbench
public class JDBC_Example {
	public static void main(String args[]) {
		try {
			//1.register to driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "harivarman");
			
			//3.statement
			Statement stmt = conn.createStatement() ;
			
			//4.execute query
			ResultSet rs = stmt.executeQuery("select * from festival_days");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "+rs.getString(3));
			}

			// 5.close the connection
			conn.close();
		} catch (Exception e) {

		}
	}
}
