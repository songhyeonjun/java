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
			//query = query + " WHERE U_NAME LIKE '%�迬��%'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pw);
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("������:"+rs.getString("U_IDX"));
				System.out.println("�����̸�:"+rs.getString("U_NAME"));
				System.out.println("�������̵�:"+rs.getString("U_ID"));
				System.out.println("������й�ȣ:"+rs.getString("U_PW"));
				System.out.println("���������:"+rs.getString("U_RGSTDATE"));
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