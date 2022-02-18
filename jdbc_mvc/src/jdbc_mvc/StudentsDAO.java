package jdbc_mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentsDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public StudentsDAO(Connection con) {
		this.con =  con;
	}
	
	/**
	 * 학생목록 구하는 함수
	 * @return
	 */
	public ArrayList<StudentsVO> list(){
		ArrayList<StudentsVO> list = new ArrayList<StudentsVO>();
		String query = "select s.s_idx, s.s_gender, d.d_name,"
			+ " s.s_name, s.s_phone, s.s_birth, s.s_rgstdate"
			+ " from students s left join duty d"
			+ " on s.d_idx = d.d_idx "
			+ " order by s.s_idx DESC";
		
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				StudentsVO studentsVo = new StudentsVO();
				
				studentsVo.setS_idx(rs.getInt("s_idx"));
				studentsVo.setS_gender(rs.getString("s_gender"));
				studentsVo.setD_name(rs.getString("d_name"));
				studentsVo.setS_name(rs.getString("s_name"));
				studentsVo.setS_phone(rs.getString("s_phone"));
				studentsVo.setS_birth(rs.getString("s_birth"));
				studentsVo.setS_rgstdate(rs.getTimestamp("s_rgstdate"));
				list.add(studentsVo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}
	
	/**
	 * 학생한명을 등록하는 함수
	 * @param studentsVo
	 */
	public void insert(StudentsVO studentsVo) {
		String query = "INSERT INTO students(s_name, s_gender, s_phone, s_birth)"
				+ " VALUES (?,?,?,?)";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, studentsVo.getS_name());
			ps.setString(2, studentsVo.getS_gender());
			ps.setString(3, studentsVo.getS_phone());
			ps.setString(4, studentsVo.getS_birth());
			if(ps.executeUpdate() > 0) {
				System.out.println(studentsVo.getS_name()+" 학생 한명이 등록 되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 학생정보를 하나 가져오는 함수
	 * @param s_idx
	 * @return
	 */
	public StudentsVO view(int s_idx) {
		StudentsVO studentsVo = new StudentsVO();
		String query = "SELECT s.s_idx, s.s_name, s.s_gender, s.d_idx, d.d_name,\r\n"
			+ " s.s_phone, s.s_birth, s.s_rgstdate, s.s_mdfydate\r\n"
			+ " FROM students s LEFT OUTER JOIN duty d ON s.d_idx = d.d_idx\r\n"
			+ " WHERE s.s_idx = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, s_idx);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				studentsVo.setS_idx(rs.getInt("s_idx"));
				studentsVo.setS_name(rs.getString("s_name"));
				studentsVo.setS_phone(rs.getString("s_phone"));
				studentsVo.setS_birth(rs.getString("s_birth"));
				studentsVo.setS_gender(rs.getString("s_gender"));
				studentsVo.setD_idx(rs.getInt("d_idx"));
				studentsVo.setD_name(rs.getString("d_name"));
				studentsVo.setS_rgstdate(rs.getTimestamp("s_rgstdate"));
				studentsVo.setS_mdfydate(rs.getTimestamp("s_mdfydate"));
			} else {
				System.out.println("원하는 사용자가 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return studentsVo;
	}
	
	/**
	 * 학생정보를 수정하는 함수
	 * @param studentsVo
	 */
	public void update(StudentsVO studentsVo) {
		String query = "UPDATE students SET s_name = ?, s_gender = ?"
			+ " , s_phone = ?, s_birth = ?,  s_mdfydate = now() WHERE s_idx = ?";
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, studentsVo.getS_name());
			ps.setString(2, studentsVo.getS_gender());
			ps.setString(3, studentsVo.getS_phone());
			ps.setString(4, studentsVo.getS_birth());
			ps.setInt(5, studentsVo.getS_idx());
			
			if(ps.executeUpdate() > 0) {
				System.out.println(studentsVo.getS_name()+" 학생 정보를 수정했습니다.");
			} else {
				System.out.println("원하는 학생이 없습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 학생 한명을 삭제합니다.
	 * @param s_idx
	 */
	public void delete(int s_idx) {
		String query = "DELETE FROM students WHERE s_idx = ?";
		try {
			ps = con.prepareStatement(query);
			ps.setInt(1, s_idx);
			if(ps.executeUpdate()>0) {
				System.out.println("학생 한명이 삭제되었습니다.");
			} else {
				System.out.println("원하는 학생이 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}