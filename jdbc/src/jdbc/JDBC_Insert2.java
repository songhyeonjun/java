package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Insert2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);		
		System.out.print("학생이름:");
		String std_name = scanner.nextLine();
		System.out.print("성별(1:남자, 2:여자):");
		String std_gender = scanner.nextLine();
		scanner.close();
		
		Connection con = null;
		PreparedStatement  pstmt = null;
		String url  = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw   = "p@ss00";
		String query = "INSERT INTO students(s_name, s_gender) values (?,?)";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBC 드라이버 로딩~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Database 연결 성공~");
			pstmt = con.prepareStatement(query);			
			pstmt.setString(1, std_name);
			pstmt.setString(2, std_gender);
			
			int cnt = pstmt.executeUpdate();
			//pstmt.executeQuery()
			System.out.println("학생"+cnt+"명 등록~");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
