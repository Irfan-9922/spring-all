package com.ij.vo;

public class studentvo {
	String name;
	String no;
	String adress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public studentvo(String name, String no, String adress) {
		super();
		this.name = name;
		this.no = no;
		this.adress = adress;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

}
