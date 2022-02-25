package com.hi.mvc01;

public class StockVO {
	private String code;
	private String company;
	private String today;
	private String yesterday;
	private String high;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getYesterday() {
		return yesterday;
	}
	public void setYesterday(String yesterday) {
		this.yesterday = yesterday;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	@Override
	public String toString() {
		return "StockVO [code=" + code + ", company=" + company + ", today=" + today + ", yesterday=" + yesterday
				+ ", high=" + high + "]";
	}
	
}
