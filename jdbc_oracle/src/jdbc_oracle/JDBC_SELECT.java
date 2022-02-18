package jdbc_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_SELECT {

	public static void main(String[] args) {
		Connection con = null; // database 연결을 위한 객체
		Statement stm = null; // SQL문을 서버로 보내기 위한 객체
		ResultSet rs = null; // SQL을 실행하고 결과를 받기 위한 객체
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "jspuser";
		String pw = "1234";
		
		String query = "SELECT * FROM USERS order by U_IDX ASC";
		
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("org.postgresql.Driver");
			System.out.println("JDBC 드라이버 로딩 성공 ~");
			
			//2. Connection 생성
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database 연결 성공 ~");
			
			//3. Statement 객체 생성
			stm = con.createStatement();
			
			//4. 쿼리 실행 후 결과를 리턴
			rs = stm.executeQuery(query);
			
			//5. 받은 결과에서 데이터 얻기
			// 데이터가 두개 이상
			while(rs.next()) {//다음번 데이터가 있는지 확인
				
				//re.getString(숫자) : 불러오는 컬럼의 순서, 왼쪽부터 1로 시작
				//re.getString(컬럼명) : 불러오는 컬럼의 명칭
				System.out.print(rs.getInt("U_IDX") + " "); //int 값 가져오기
				System.out.print(rs.getString("U_NAME") + " "); //문자열 값 가져오기
				System.out.print(rs.getString("U_ID") + " "); //날짜형
				System.out.print(rs.getString("U_PW") + " ");
				System.out.println(rs.getTimestamp("U_RGSTDATE"));
			}
			
			// 데이터가 하나일 경우
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
			// 6. Statement 객체 close & 반환
			if(stm != null) {
				try {
					stm.close();
				} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			// 7. ResultSet 객체 close & 반환
			if(rs != null) {
				try {
					rs.close();
				} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			//8. Connection 사용 후 close & 반환
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
 