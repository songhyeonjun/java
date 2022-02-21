package com.hi.mvc04;

public class ProductVO {
	
	private String id;
	private String name;
	private String content;
	private int price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", content=" + content + ", price=" + price + "]";
	}
	

}
