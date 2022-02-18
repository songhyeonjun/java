package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JDBC_Update {

	public static void main(String[] args) {
		Connection con = null; // database ������ ���� ��ü
		Statement stm  = null; // SQL ���� ������ ������ ���� ��ü
		ResultSet rs   = null; // SQL�� �����ϰ� ����� �ޱ����� ��ü
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������:");
		String std_idx = scanner.nextLine();
		System.out.print("�л��̸�:");
		String std_name = scanner.nextLine();
		System.out.print("����(1:����, 2:����):");
		String std_gender = scanner.nextLine();
		scanner.close();
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "p@ss00";
		String query = "UPDATE students SET s_name='"+std_name+"', s_gender='"+std_gender
				+"', s_mdfydate = current_timestamp() WHERE s_idx="+std_idx;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pw);
			stm = con.createStatement();
			
			//--------------- UPDATE ����[START]
			int cnt = stm.executeUpdate(query);
			System.out.println(cnt+"���� ����Ÿ ����");
			//--------------- UPDATE ����[END]
			
			//--------------- SELECT ����[START]
			query = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_rgstdate\r\n"
					+ "from students s left join duty d\r\n"
					+ "on s.d_idx = d.d_idx order by d.d_ranking is null asc,\r\n"
					+ "d.d_ranking, s.s_name";
			rs = stm.executeQuery(query);
			
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd");
			String std_gender_0 = "";
			while(rs.next()) {//������ ����Ÿ�� �ִ��� Ȯ��
				if(rs.getString("s_gender").equals("1")) {
					std_gender_0 = "����";
				} else {
					std_gender_0 = "����";
				}
				if(rs.getString("d_name") == null) { 
					System.out.println(rs.getString("s_idx")
						+" | "+"���л� | "+rs.getString("s_name")
						+" | "+std_gender_0
						+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
				} else {
					System.out.println(rs.getString("s_idx")
						+" | "+rs.getString("d_name")
						+" | "+rs.getString("s_name")
						+" | "+std_gender_0
						+" | "+format1.format(rs.getTimestamp("s_rgstdate")));
				}
			}
			//--------------- SELECT ����[END]
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
