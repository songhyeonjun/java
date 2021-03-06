package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Test {

	public static void main(String[] args) {
		Connection con = null; // database 연결을 위한 객체
		Statement stm  = null; // SQL 문을 서버로 보내기 위한 객체
		ResultSet rs   = null; // SQL을 실행하고 결과를 받기 위한 객체
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "p@ss00";
		
		String query  = "SELECT s_idx, s_name, s_rgstdate FROM students"
				+ " where s_gender='2'";
		//String query  = "SELECT COUNT(s_idx) FROM students";
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			//Class.forName("org.postgresql.Driver");
			System.out.println("JDBC 드라이버 로딩 성공~");
			
			//2. Connection 생성
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database 연결 성공~");
			
			//3. Satement 객체 생성
			stm = con.createStatement();
			
			//4. 쿼리 실행후 결과를 리턴
			rs = stm.executeQuery(query);
			
			//5. 받은 결과에서 데이타 얻기
			// 데이타가 두개 이상
			while(rs.next()) {//다음번 데이타가 있는지 확인
				
				//rs.getString(숫자) : 불러오는 컬럼의 순서, 왼쪽부터 1로 시작
				//rs.getString(컬럼명) : 불러오는 컬럼의 명칭
				System.out.println(rs.getInt("s_idx"));//int 값 가져오기
				System.out.println(rs.getString("s_name"));//문자열 값 가져오기
				System.out.println(rs.getTimestamp("s_rgstdate"));//날짜+시간     
				System.out.println(rs.getDate("s_rgstdate"));//날짜형
				
			}
			// 데이타가 하나일 경우
			/*if(rs.next()) {
				System.out.println(rs.getInt(1));
			}*/
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//6. Statement 객체 close & 반환
			if(stm != null) {
				try {
					stm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//7. ResultSet 객체 close & 반환
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//8. Connection 사용후 close & 반환
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
