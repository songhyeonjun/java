package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class dd {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
    	System.out.println("성별(1 : 남자), (2 : 여자), (3 : 모두)");
		int std_gender = scanner.nextInt();
		scanner.close();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "twq34753";
		String query;
		if(std_gender < 3) {
			query = "SELECT * FROM student WHERE s_gender = ?";
		}
		else {
			query = "SELECT * FROM student";
		}
		
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBC 드라이버 로딩 ~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Dattabase 연결 성공 ~");
			
			pstmt = con.prepareStatement(query);
			
			if(std_gender < 3) {
				pstmt.setInt(1, std_gender);
				
				rs = pstmt.executeQuery();
				
			}
			else {
				rs = pstmt.executeQuery();
			}

			while(rs.next()) {//다음번 데이터가 있는지 확인
				
				//re.getString(숫자) : 불러오는 컬럼의 순서, 왼쪽부터 1로 시작
				//re.getString(컬럼명) : 불러오는 컬럼의 명칭
				System.out.print(rs.getInt("s_idx")); //int 값 가져오기
				System.out.print(rs.getString("s_name")); //문자열 값 가져오기
				System.out.println(rs.getTimestamp("s_rgstdate")); //날짜형
				
			}
			
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}			
			}
			if(rs != null) {
				try {
					rs.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
