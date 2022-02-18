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
		
		System.out.print("수정할 학생 번호 입력 : ");
		String std_idx = scanner.nextLine();
		System.out.print("학생 이름 수정 : ");
		String std_name = scanner.nextLine();
    	System.out.print("성별 수정(1 : 남자), (2 : 여자) ");
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
				System.out.println("수정 쿼리 실행 O");
			}
			else {
				System.out.println("수정 쿼리 실행 X");
			}
			

			SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd");
			String std_gender_0 = "";
			while(rs.next()) {//다음번 데이타가 있는지 확인
				if(rs.getString("s_gender").equals("1")) {
					std_gender_0 = "남자";
				} else {
					std_gender_0 = "여자";
				}
				if(rs.getString("d_name") == null) { 
					System.out.println(rs.getString("s_idx")
						+" | "+"반학생 | "+rs.getString("s_name")
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
				System.out.println("커넥션이 아직 살아 있음");
				try {
					con.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(stm != null) {
				System.out.println("커넥션이 아직 살아 있음");
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
