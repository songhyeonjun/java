package ex_class;

import java.sql.Date;

public class User {

	private int idx;
	private String id;
	private String password;
	private String name;
	private String birth;
	private String email;
	private String phone;
	private String rgstdate;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRgstdate() {
		return rgstdate;
	}
	public void setRgstdate(String rgstdate) {
		this.rgstdate = rgstdate;
	}
}
