package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test {

	public static void main(String[] args) {
		Connection con = null; // database ������ ���� ��ü
		Statement stm  = null; // SQL ���� ������ ������ ���� ��ü
		ResultSet rs   = null; // SQL�� �����ϰ� ����� �ޱ� ���� ��ü
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "p@ss00";
		
		String query  = "SELECT s_idx, s_name, s_rgstdate FROM students"
				+ " where s_gender='2'";
		//String query  = "SELECT COUNT(s_idx) FROM students";
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("org.mariadb.jdbc.Driver");
			//Class.forName("org.postgresql.Driver");
			System.out.println("JDBC ����̹� �ε� ����~");
			
			//2. Connection ����
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database ���� ����~");
			
			//3. Satement ��ü ����
			stm = con.createStatement();
			
			//4. ���� ������ ����� ����
			rs = stm.executeQuery(query);
			
			//5. ���� ������� ����Ÿ ���
			// ����Ÿ�� �ΰ� �̻�
			while(rs.next()) {//������ ����Ÿ�� �ִ��� Ȯ��
				
				//rs.getString(����) : �ҷ����� �÷��� ����, ���ʺ��� 1�� ����
				//rs.getString(�÷���) : �ҷ����� �÷��� ��Ī
				System.out.println(rs.getInt("s_idx"));//int �� ��������
				System.out.println(rs.getString("s_name"));//���ڿ� �� ��������
				System.out.println(rs.getTimestamp("s_rgstdate"));//��¥+�ð�     
				System.out.println(rs.getDate("s_rgstdate"));//��¥��
				
			}
			// ����Ÿ�� �ϳ��� ���
			/*if(rs.next()) {
				System.out.println(rs.getInt(1));
			}*/
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//6. Statement ��ü close & ��ȯ
			if(stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//7. ResultSet ��ü close & ��ȯ
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//8. Connection ����� close & ��ȯ
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}