package jdbc_mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author hi
 *
 * ������ ���̽� Ŀ�ؼ� ����
 */
public class DataBase {
	private Connection con;
	public DataBase() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Mariadb ����̹� �ε�");
			String connurl = "jdbc:mariadb://localhost:3306/sharedb";
			String user    = "sharedb";
			String pwd     = "p@ss00";
			con = DriverManager.getConnection(connurl, user, pwd);
			System.out.println("Mariadb Connection ����");
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