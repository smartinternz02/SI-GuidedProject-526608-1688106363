import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JDBC_update {

	public static void main(String args[]) {
		try {
			//1.register to driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon", "root", "harivarman");
			
			//3.statement
			Statement stmt = conn.createStatement() ;
			
			//4.execute query
			int rs = stmt.executeUpdate("insert into products(sno,productname,price,discount) values(6,'Computer',80000,'20%')");
			
			if(rs>0) {
				System.out.println("Succesfully Updated!");
			}

			// 5.close the connection
			conn.close();
		} catch (Exception e) {

		}
	}

}
