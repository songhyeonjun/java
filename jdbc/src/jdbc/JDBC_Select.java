package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JDBC_Select {

	//���� �����ؼ� ���� �˻� �ϴ� ���α׷�
	public static void main(String[] args) {
		Connection con = null; // database ������ ���� ��ü
		PreparedStatement pstmt  = null; // SQL ���� ������ ������ ���� ��ü
		ResultSet rs   = null; // SQL�� �����ϰ� ����� �ޱ����� ��ü
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "p@ss00";
		String query  = "";
		//1. JDBC ����̹� �ε�
		try {
			Scanner scanner = new Scanner(System.in);
			Class.forName("org.mariadb.jdbc.Driver");
			
			//2. Connection ����
			con = DriverManager.getConnection(url, user, pw);
			
			query  = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_rgstdate\r\n"
					+ "from students s left join duty d\r\n"
					+ "on s.d_idx = d.d_idx\r\n"
					+ "WHERE s.s_gender IN (?,?)\r\n"
					+ "order by d.d_ranking is null asc,\r\n"
					+ "d.d_ranking, s.s_name";
			
			//3. PreparedStatement ��ü ����
			pstmt = con.prepareStatement(query);
			while(true) {
				System.out.print("�����˻�(1:����, 2:����, 3:��ü, q:������):");
				String std_gender = scanner.nextLine();				
				
				if(std_gender.equals("q")) {
					break;
				}
				
				if(std_gender.equals("3")) {
					pstmt.setString(1, "1");
					pstmt.setString(2, "2");	
				} else {
					pstmt.setString(1, std_gender);
					pstmt.setString(2, std_gender);	
				}
				
				//4. ���� ������ ����� ����
				rs = pstmt.executeQuery();
				//5. ���� ������� ����Ÿ ���
				// ����Ÿ�� �ΰ� �̻�
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
			}
			scanner.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
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