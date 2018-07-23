package com.ij.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class robot {
	private String type;
	private int id;
	private Date d;
	@Required
	public void setType(String type) {
		this.type = type;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	@Required
	public void setD(Date d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "robot [type=" + type + ", id=" + id + ", d=" + d + "]";
	}
	

}
