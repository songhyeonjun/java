package jdbc_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("유저이름 : ");
		String std_name = scanner.nextLine();
    	System.out.print("유저 아이디 : ");
		String std_id = scanner.nextLine();
		System.out.print("유저 패스워드 : ");
		String std_pw = scanner.nextLine();
		scanner.close();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "jspuser";
		String pw = "1234";
		String query = "INSERT INTO USERS(U_IDX, U_NAME, U_ID, U_PW, U_RGSTDATE)"
				+ " VALUES(USERS_SEQ.NEXTVAL,?,?,?,systimestamp)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("JDBC 드라이버 로딩 ~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Dattabase 연결 성공 ~");

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, std_name);
			pstmt.setString(2, std_id);
			pstmt.setString(3, std_pw);
			
			
			int cnt = pstmt.executeUpdate();
			System.out.println("학생" + cnt + " 등록 ~ ");
			
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
		}
	}

}
