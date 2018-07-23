package com.ij.beans;

import java.util.Date;

public class WishGenrator {
	//bean genrater 
	private  String name;
	private Date date;
	public WishGenrator()
	{
		System.out.println("wish genratoer 0 parmconstrauvctor ");
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
public String genrateWishmsg()
{
	return "good morning"+name+"--->"+date;
}
}
