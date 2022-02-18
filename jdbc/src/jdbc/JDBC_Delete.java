package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Delete {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������:");
		String std_idx = scanner.nextLine();
		scanner.close();
		
		Connection con = null; // database ������ ���� ��ü
		Statement stm  = null; // SQL ���� ������ ������ ���� ��ü
		ResultSet rs   = null; // SQL�� �����ϰ� ����� �ޱ����� ��ü
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "p@ss00";
		String query  = "DELETE FROM students WHERE s_idx="+std_idx;
		
		//1. JDBC ����̹� �ε�
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			//2. Connection ����
			con = DriverManager.getConnection(url, user, pw);
			//3. Satement ��ü ����
			stm = con.createStatement();
			//--------------- UPDATE ����[START]
			int cnt = stm.executeUpdate(query);
			System.out.println(cnt+"���� ����Ÿ ����");
			//--------------- UPDATE ����[END]
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				System.out.println("Ŀ�ؼ��� ���� ��� ����.");
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("Ŀ�ؼ��� ����.");
			}
			if(stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
