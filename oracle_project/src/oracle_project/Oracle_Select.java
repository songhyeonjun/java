package oracle_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Oracle_Select {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id  = "jspuser";
		String pw  = "12345";
		String query = "SELECT U_IDX, U_NAME, U_ID, U_PW, U_RGSTDATE FROM USERS";
			//query = query + " WHERE U_NAME LIKE '%김연경%'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pw);
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("시퀀스:"+rs.getString("U_IDX"));
				System.out.println("유저이름:"+rs.getString("U_NAME"));
				System.out.println("유저아이디:"+rs.getString("U_ID"));
				System.out.println("유저비밀번호:"+rs.getString("U_PW"));
				System.out.println("유저등록일:"+rs.getString("U_RGSTDATE"));
				System.out.println("==========================================");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				rs.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}