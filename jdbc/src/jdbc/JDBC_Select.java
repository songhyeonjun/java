package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JDBC_Select {

	//남여 선택해서 조건 검색 하는 프로그램
	public static void main(String[] args) {
		Connection con = null; // database 연결을 위한 객체
		PreparedStatement pstmt  = null; // SQL 문을 서버로 보내기 위한 객체
		ResultSet rs   = null; // SQL을 실행하고 결과를 받기위한 객체
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "p@ss00";
		String query  = "";
		//1. JDBC 드라이버 로딩
		try {
			Scanner scanner = new Scanner(System.in);
			Class.forName("org.mariadb.jdbc.Driver");
			
			//2. Connection 생성
			con = DriverManager.getConnection(url, user, pw);
			
			query  = "select s.s_idx, s.s_gender, d.d_name, s.s_name, s.s_rgstdate\r\n"
					+ "from students s left join duty d\r\n"
					+ "on s.d_idx = d.d_idx\r\n"
					+ "WHERE s.s_gender IN (?,?)\r\n"
					+ "order by d.d_ranking is null asc,\r\n"
					+ "d.d_ranking, s.s_name";
			
			//3. PreparedStatement 객체 생성
			pstmt = con.prepareStatement(query);
			while(true) {
				System.out.print("성별검색(1:남자, 2:여자, 3:전체, q:끝내기):");
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
				
				//4. 쿼리 실행후 결과를 리턴
				rs = pstmt.executeQuery();
				//5. 받은 결과에서 데이타 얻기
				// 데이타가 두개 이상
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