package com.ij.dto;

import java.io.Serializable;

public class stdto implements Serializable {
	private String name;
	public stdto(String name, int no, String adress) {
		super();
		this.name = name;
		this.no = no;
		this.adress = adress;
	}
	public stdto(String name2) {
		// TODO Auto-generated constructor stub
	}
	public stdto(String name2, int no2) {
		// TODO Auto-generated constructor stub
	}
	private int no;
	private String adress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	@Override
	public String toString() {
		return "stdto [name=" + name + ", no=" + no + ", adress=" + adress + "]";
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
}
