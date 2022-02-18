package jdbc_oracle;

import java.sql.Timestamp;

public class UsersVO {
	private int U_IDX;
	private String U_NAME;
	private String U_ID;
	private String U_PW;
	private Timestamp U_RGSTDATE;
	public int getU_IDX() {
		return U_IDX;
	}
	public void setU_IDX(int u_IDX) {
		U_IDX = u_IDX;
	}
	public String getU_NAME() {
		return U_NAME;
	}
	public void setU_NAME(String u_NAME) {
		U_NAME = u_NAME;
	}
	public String getU_ID() {
		return U_ID;
	}
	public void setU_ID(String u_ID) {
		U_ID = u_ID;
	}
	public String getU_PW() {
		return U_PW;
	}
	public void setU_PW(String u_PW) {
		U_PW = u_PW;
	}
	public Timestamp getU_RGSTDATE() {
		return U_RGSTDATE;
	}
	public void setU_RGSTDATE(Timestamp u_RGSTDATE) {
		U_RGSTDATE = u_RGSTDATE;
	}
	
}