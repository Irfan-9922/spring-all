package com.ij.beans;

import org.springframework.beans.factory.annotation.Required;

public class Student_detail {
	private String no;
	private String name;
	private String add;

	public Student_detail(String no, String name, String add) {
	System.out.println("0 param costructor");
		this.no = no;
		this.name = name;
		this.add = add;
	}
	
	public void setNo(String no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student_detail [no=" + no + ", name=" + name + ", add=" + add
				+ "]";
	}
	

}
