package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JDBC_UpdateEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �л� ��ȣ �Է� : ");
		String std_idx = scanner.nextLine();
		System.out.print("�л� �̸� ���� : ");
		String std_name = scanner.nextLine();
    	System.out.print("���� ����(1 : ����), (2 : ����) ");
		String std_gender = scanner.nextLine();
		scanner.close();
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		

		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "twq34753";
		String query = "UPDATE student SET s_name = '"+std_name+"', s_gender = '"+std_gender+"' "
				+ "where s_idx =" + std_idx;
		String imsi = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_rgstdate\r\n"
				+ "from student s left join duty d\r\n"
				+ "on s.d_idx = d.d_idx order by d.d_ranking is null asc,\r\n"
				+ "d.d_ranking, s.s_name";
		
		
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pw);
			stm = con.createStatement();
			stm.execute(query);
			rs = stm.executeQuery(imsi);
			
			if(stm.executeUpdate(query) > 0) {
				System.out.println("���� ���� ���� O");
			}
			else {
				System.out.println("���� ���� ���� X");
			}
			

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
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con != null) {
				System.out.println("Ŀ�ؼ��� ���� ��� ����");
				try {
					con.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(stm != null) {
				System.out.println("Ŀ�ؼ��� ���� ��� ����");
				try {
					stm.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
