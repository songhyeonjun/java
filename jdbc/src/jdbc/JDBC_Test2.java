package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class JDBC_Test2 {

	public static void main(String[] args) {
		Connection con = null; // database ������ ���� ��ü
		Statement stm  = null; // SQL ���� ������ ������ ���� ��ü
		ResultSet rs   = null; // SQL�� �����ϰ� ����� �ޱ����� ��ü
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "p@ss00";
		String query  = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_rgstdate\r\n"
				+ "from students s left join duty d\r\n"
				+ "on s.d_idx = d.d_idx order by d.d_ranking is null asc,\r\n"
				+ "d.d_ranking, s.s_name";
		//1. JDBC ����̹� �ε�
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			//2. Connection ����
			con = DriverManager.getConnection(url, user, pw);
			//3. Satement ��ü ����
			stm = con.createStatement();
			//4. ���� ������ ����� ����
			rs = stm.executeQuery(query);
			//5. ���� ������� ����Ÿ ���
			// ����Ÿ�� �ΰ� �̻�
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd");
			String std_gender = "";
			while(rs.next()) {//������ ����Ÿ�� �ִ��� Ȯ��
				if(rs.getString("s_gender").equals("1")) {
					std_gender = "����";
				} else {
					std_gender = "����";
				}
				if(rs.getString("d_name") == null) { 
					System.out.println(rs.getString("s_idx")
						+" | "+"���л� | "+rs.getString("s_name")
						+" | "+std_gender
						+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
				} else {
					System.out.println(rs.getString("s_idx")
						+" | "+rs.getString("d_name")
						+" | "+rs.getString("s_name")
						+" | "+std_gender
						+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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