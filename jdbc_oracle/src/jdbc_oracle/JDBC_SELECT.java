package jdbc_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_SELECT {

	public static void main(String[] args) {
		Connection con = null; // database ������ ���� ��ü
		Statement stm = null; // SQL���� ������ ������ ���� ��ü
		ResultSet rs = null; // SQL�� �����ϰ� ����� �ޱ� ���� ��ü
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "jspuser";
		String pw = "1234";
		
		String query = "SELECT * FROM USERS order by U_IDX ASC";
		
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("org.postgresql.Driver");
			System.out.println("JDBC ����̹� �ε� ���� ~");
			
			//2. Connection ����
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database ���� ���� ~");
			
			//3. Statement ��ü ����
			stm = con.createStatement();
			
			//4. ���� ���� �� ����� ����
			rs = stm.executeQuery(query);
			
			//5. ���� ������� ������ ���
			// �����Ͱ� �ΰ� �̻�
			while(rs.next()) {//������ �����Ͱ� �ִ��� Ȯ��
				
				//re.getString(����) : �ҷ����� �÷��� ����, ���ʺ��� 1�� ����
				//re.getString(�÷���) : �ҷ����� �÷��� ��Ī
				System.out.print(rs.getInt("U_IDX") + " "); //int �� ��������
				System.out.print(rs.getString("U_NAME") + " "); //���ڿ� �� ��������
				System.out.print(rs.getString("U_ID") + " "); //��¥��
				System.out.print(rs.getString("U_PW") + " ");
				System.out.println(rs.getTimestamp("U_RGSTDATE"));
			}
			
			// �����Ͱ� �ϳ��� ���
//			if(rs.next()) {
//				System.out.println(rs.getInt(1));
//			}
//			
			
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			// 6. Statement ��ü close & ��ȯ
			if(stm != null) {
				try {
					stm.close();
				} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			// 7. ResultSet ��ü close & ��ȯ
			if(rs != null) {
				try {
					rs.close();
				} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			//8. Connection ��� �� close & ��ȯ
			if(con != null) {
				try {
					con.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
 