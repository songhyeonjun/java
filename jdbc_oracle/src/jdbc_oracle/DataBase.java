package jdbc_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	private Connection con;

	public DataBase() {
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle ����̹� �ε�");
			String connerl = "jdbc:oracle:thin:@localhost:1521:XE";
			String user    = "jspuser";
			String pw      = "1234";
			con = DriverManager.getConnection(connerl, user, pw);
			System.out.println("Oracle Connection ����");
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
