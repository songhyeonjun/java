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
		
    	System.out.println("����(1 : ����), (2 : ����), (3 : ���)");
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
			System.out.println("JDBC ����̹� �ε� ~");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Dattabase ���� ���� ~");
			
			pstmt = con.prepareStatement(query);
			
			if(std_gender < 3) {
				pstmt.setInt(1, std_gender);
				
				rs = pstmt.executeQuery();
				
			}
			else {
				rs = pstmt.executeQuery();
			}

			while(rs.next()) {//������ �����Ͱ� �ִ��� Ȯ��
				
				//re.getString(����) : �ҷ����� �÷��� ����, ���ʺ��� 1�� ����
				//re.getString(�÷���) : �ҷ����� �÷��� ��Ī
				System.out.print(rs.getInt("s_idx")); //int �� ��������
				System.out.print(rs.getString("s_name")); //���ڿ� �� ��������
				System.out.println(rs.getTimestamp("s_rgstdate")); //��¥��
				
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
