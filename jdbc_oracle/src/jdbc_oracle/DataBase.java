package jdbc_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	private Connection con;

	public DataBase() {
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle 드라이버 로딩");
			String connerl = "jdbc:oracle:thin:@localhost:1521:XE";
			String user    = "jspuser";
			String pw      = "1234";
			con = DriverManager.getConnection(connerl, user, pw);
			System.out.println("Oracle Connection 성공");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return con;
	}

}
