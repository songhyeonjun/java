package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Delete {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("시퀀스:");
		String std_idx = scanner.nextLine();
		scanner.close();
		
		Connection con = null; // database 연결을 위한 객체
		Statement stm  = null; // SQL 문을 서버로 보내기 위한 객체
		ResultSet rs   = null; // SQL을 실행하고 결과를 받기위한 객체
		
		String url = "jdbc:mariadb://localhost:3306/sharedb";
		String user = "sharedb";
		String pw = "p@ss00";
		String query  = "DELETE FROM students WHERE s_idx="+std_idx;
		
		//1. JDBC 드라이버 로딩
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			//2. Connection 생성
			con = DriverManager.getConnection(url, user, pw);
			//3. Satement 객체 생성
			stm = con.createStatement();
			//--------------- UPDATE 수행[START]
			int cnt = stm.executeUpdate(query);
			System.out.println(cnt+"개의 데이타 삭제");
			//--------------- UPDATE 수행[END]
			
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
