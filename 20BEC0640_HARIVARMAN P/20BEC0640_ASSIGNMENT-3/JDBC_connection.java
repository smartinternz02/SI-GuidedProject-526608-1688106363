import java.sql.Connection;
import java.sql.DriverManager;


//JDBC retrieve data from MYSQL workbench
public class JDBC_connection {
	public static void main(String args[]) {
		try {
			//1.register to driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "harivarman");
			
			System.out.println("Successfully Connected!");
			//3.close the connection
			conn.close();
		}
		catch(Exception e) {
		}
	}
}