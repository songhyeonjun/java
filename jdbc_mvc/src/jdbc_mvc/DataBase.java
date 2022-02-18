package jdbc_mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author hi
 *
 * 데이터 베이스 커넥션 연결
 */
public class DataBase {
	private Connection con;
	public DataBase() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Mariadb 드라이버 로딩");
			String connurl = "jdbc:mariadb://localhost:3306/sharedb";
			String user    = "sharedb";
			String pwd     = "p@ss00";
			con = DriverManager.getConnection(connurl, user, pwd);
			System.out.println("Mariadb Connection 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return con;
	}
	
	
	
	
	
	
	
	
}