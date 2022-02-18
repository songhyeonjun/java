package jdbc_mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public StudentDAO(Connection conn) {
		con = conn;
		
	}
	
	/*
	 * �л� ��� ���ϴ� �Լ�
	 * @return
	*/
	public ArrayList<StudentVO> list() {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		String query = "select s.s_idx, d.d_name, s.s_name, s.s_rgstdate,"
				+ " s.s_gender, s.s_phone, s.s_birth \r\n"
				+ "from  student s\r\n"
				+ "left join duty d\r\n"
				+ "on s.d_idx = d.d_idx\r\n"
				+ "order by s.s_idx DESC";
		
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				StudentVO studentVo = new StudentVO();
				
				studentVo.setS_idx(rs.getInt("s_idx"));
				studentVo.setS_gender(rs.getString("s_gender"));
				studentVo.setD_name(rs.getString("d_name"));
				studentVo.setS_name(rs.getString("s_name"));
				studentVo.setS_phone(rs.getString("s_phone"));
				studentVo.setS_birth(rs.getString("s_birth"));
				studentVo.setS_rgstdate(rs.getTimestamp("s_rgstdate"));
				list.add(studentVo);
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
	public void insert(StudentVO studentVo) {
		String query = "INSERT INTO student(s_name, s_gender, s_phone, s_birth)"
				+ " VALUES (?,?,?,?)";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, studentVo.getS_name());
			ps.setString(2, studentVo.getS_gender());
			ps.setString(3, studentVo.getS_phone());
			ps.setString(4, studentVo.getS_birth());
			if(ps.executeUpdate() > 0) {
				System.out.println(studentVo.getS_name() + " �л� �Ѹ��� ��� �Ǿ����ϴ�.");
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

	public StudentVO view(int s_idx) {
		StudentVO studentVo = new StudentVO();
		String query = "SELECT s.s_idx, s.s_name, s.s_gender, s.d_idx, d.d_name,"
				+ " s.s_phone, s.s_birth, s.s_rgstdate, s.s_mdfydate"
				+ " FROM student s LEFT JOIN duty d ON s.d_idx = d.d_idx"
				+ " WHERE s_idx = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, s_idx);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				studentVo.setS_idx(rs.getInt("s_idx"));
				studentVo.setS_name(rs.getString("s_name"));
				studentVo.setS_gender(rs.getString("s_gender"));
				studentVo.setD_idx(rs.getInt("d_idx"));
				studentVo.setD_name(rs.getString("d_name"));
				studentVo.setS_phone(rs.getString("s_phone"));
				studentVo.setS_birth(rs.getString("s_birth"));
				studentVo.setS_rgstdate(rs.getTimestamp("s_rgstdate"));
				studentVo.setS_mdfydate(rs.getTimestamp("s_mdfydate"));
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
		
		
		return studentVo;
	}
	
	/*
	 * �л������� �����ϴ� �Լ�
	 * @param studentVo
	*/
	public void update(StudentVO studentVo) {
		String query = "UPDATE student SET s_name = ?, s_gender = ?,"
				+ " s_mdfydate = now(), s_phone = ?, s_birth = ? WHERE s_idx = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, studentVo.getS_name());
			ps.setString(2, studentVo.getS_gender());
			ps.setString(3, studentVo.getS_phone());
			ps.setString(4, studentVo.getS_birth());
			ps.setInt(5, studentVo.getS_idx());
			
			if(ps.executeUpdate() > 0) {
				System.out.println(studentVo.getS_name() + " �л� ������ �����߽��ϴ�.");
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
	public void delete(int s_idx) {
		String query = "DELETE FROM student WHERE s_idx = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, s_idx);
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
