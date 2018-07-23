package com.ij.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student_detail {
	private home h;
	public Student_detail(home h) {
	
		this.h = h;
	}

	
	
	private String no;
	private String name;
	
	private String add;

	
	

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
		return "Student_detail [h=" + h + ", no=" + no + ", name=" + name
				+ ", add=" + add + "]";
	}
	
	
	

}
