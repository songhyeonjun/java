package jdbc_mvc;

import java.sql.Timestamp;

public class StudentsVO {
	private int s_idx; //학생시퀀스
	private int d_idx; //직함시퀀스
	private String s_name; //학생명
	private String s_birth; //생년월일
	private String d_name; //직함명
	private String s_gender; //성별
	private Timestamp s_rgstdate; //등록일
	private Timestamp s_mdfydate; //수정일
	private String s_phone; //휴대폰번호
	
	public String getS_birth() {
		return s_birth;
	}
	public void setS_birth(String s_birth) {
		this.s_birth = s_birth;
	}
	public String getS_phone() {
		return s_phone;
	}
	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}
	public int getS_idx() {
		return s_idx;
	}
	public void setS_idx(int s_idx) {
		this.s_idx = s_idx;
	}
	public int getD_idx() {
		return d_idx;
	}
	public void setD_idx(int d_idx) {
		this.d_idx = d_idx;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_gender() {
		return s_gender;
	}
	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}
	public Timestamp getS_rgstdate() {
		return s_rgstdate;
	}
	public void setS_rgstdate(Timestamp s_rgstdate) {
		this.s_rgstdate = s_rgstdate;
	}
	public Timestamp getS_mdfydate() {
		return s_mdfydate;
	}
	public void setS_mdfydate(Timestamp s_mdfydate) {
		this.s_mdfydate = s_mdfydate;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
}