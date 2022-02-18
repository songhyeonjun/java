package oracle_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Oracle_Insert {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id  = "jspuser";
		String pw  = "12345";
		String query = "INSERT INTO USERS(U_IDX, U_NAME, U_ID, U_PW, U_RGSTDATE)";
			query = query + " VALUES(USERS_SEQ.NEXTVAL,'È«»ï','redman','3333',systimestamp)";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pw);
			ps = con.prepareStatement(query);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}	
			}
		}
	}
}
