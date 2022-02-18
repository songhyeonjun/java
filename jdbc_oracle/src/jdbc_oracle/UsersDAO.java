package jdbc_oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsersDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public UsersDAO(Connection conn) {
		con = conn;
		
	}
	
	/*
	 * �л� ��� ���ϴ� �Լ�
	 * @return
	*/
	public ArrayList<UsersVO> list() {
		ArrayList<UsersVO> list = new ArrayList<UsersVO>();
		String query = "SELECT * FROM USERS";
		
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				UsersVO UsersVo = new UsersVO();
				
				UsersVo.setU_IDX(rs.getInt("U_IDX"));
				UsersVo.setU_NAME(rs.getString("U_NAME"));
				UsersVo.setU_ID(rs.getString("U_ID"));
				UsersVo.setU_PW(rs.getString("U_PW"));
				UsersVo.setU_RGSTDATE(rs.getTimestamp("U_RGSTDATE"));
				list.add(UsersVo);
				}
			} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(ps != null) {
				try {
					ps.close();
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
		
		return list;
	}
	
	/*
	 * �л� �Ѹ��� ����ϴ� �Լ�
	 * @param studentVo
	*/
	public void insert(UsersVO UsersVo) {
		String query = "INSERT INTO USERS(U_IDX, U_NAME, U_ID, U_PW, U_RGSTDATE)"
				+ " VALUES (USERS_SEQ.NEXTVAL,?,?,?,systimestamp)";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, UsersVo.getU_NAME());
			ps.setString(2, UsersVo.getU_ID());
			ps.setString(3, UsersVo.getU_PW());
			
			if(ps.executeUpdate() > 0) {
				System.out.println(UsersVo.getU_NAME() + " �л� �Ѹ��� ��� �Ǿ����ϴ�.");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			if(ps != null) {
				try {
					ps.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public UsersVO view(int u_idx) {
		UsersVO UsersVo = new UsersVO();
		String query = "SELECT * FROM USERS WHERE U_IDX = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, u_idx);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				UsersVo.setU_IDX(rs.getInt("U_IDX"));
				UsersVo.setU_NAME(rs.getString("U_NAME"));
				UsersVo.setU_ID(rs.getString("U_ID"));
				UsersVo.setU_PW(rs.getString("U_PW"));
				UsersVo.setU_RGSTDATE(rs.getTimestamp("U_RGSTDATE"));
				
			}
			else {
				System.out.println("���ϴ� ����ڰ� �����ϴ�.");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(ps != null) {
				try {
					ps.close();
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
		
		
		return UsersVo;
	}
	
	/*
	 * �л������� �����ϴ� �Լ�
	 * @param studentVo
	*/
	public void update(UsersVO UsersVo) {
		String query = "UPDATE USERS SET U_NAME = ?, U_ID = ?,"
				+ " U_PW = ? WHERE U_IDX= ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, UsersVo.getU_NAME());
			ps.setString(2, UsersVo.getU_ID());
			ps.setString(3, UsersVo.getU_PW());
			ps.setInt(4, UsersVo.getU_IDX());

			if(ps.executeUpdate() > 0) {
				System.out.println(UsersVo.getU_NAME() + " �л� ������ �����߽��ϴ�.");
			}
			else {
				System.out.println("���ϴ� �л��� �����ϴ�.");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(ps != null) {
				try {
					ps.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * �л� �Ѹ��� ����
	*/
	public void delete(int U_IDX) {
		String query = "DELETE FROM USERS WHERE U_IDX = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, U_IDX);
			if(ps.executeLargeUpdate() > 0) {
				System.out.println("�л� �Ѹ��� �����Ǿ����ϴ�.");
			}
			else {
				System.out.println("���ϴ� �л��� �����ϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(ps != null) {
				try {
					ps.close();
				}
				catch (SQLException e) {
				e.printStackTrace();
				}
			}
		}
		
	}
	
	
	
}
