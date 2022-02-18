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
		Connection con = null; // database 연결을 위한 객체
		Statement stm  = null; // SQL 문을 서버로 보내기 위한 객체
		ResultSet rs   = null; // SQL을 실행하고 결과를 받기위한 객체
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시퀀스:");
		String std_idx = scanner.nextLine();
		System.out.print("학생이름:");
		String std_name = scanner.nextLine();
		System.out.print("성별(1:남자, 2:여자):");
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
			
			//--------------- UPDATE 수행[START]
			int cnt = stm.executeUpdate(query);
			System.out.println(cnt+"개의 데이타 수정");
			//--------------- UPDATE 수행[END]
			
			//--------------- SELECT 수행[START]
			query = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_rgstdate\r\n"
					+ "from students s left join duty d\r\n"
					+ "on s.d_idx = d.d_idx order by d.d_ranking is null asc,\r\n"
					+ "d.d_ranking, s.s_name";
			rs = stm.executeQuery(query);
			
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
			//--------------- SELECT 수행[END]
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				System.out.println("커넥션이 아직 살아 있음.");
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("커넥션을 끊음.");
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
