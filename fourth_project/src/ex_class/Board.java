package ex_class;

import java.util.Date;

public class Board {

	private int idx;
	private String title;
	private String name;
	private String id;
	private String contents;
	private Date rgstdate;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRgstdate() {
		return rgstdate;
	}
	public void setRgstdate(Date rgstdate) {
		this.rgstdate = rgstdate;
	}
}
