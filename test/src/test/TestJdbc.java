package test;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;

public class TestJdbc {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Shraddha", "abcd");
			if(con!=null) {
				System.out.println("conn success...");
			}else {
				System.out.println("fail....");
			}
			
		}
}
