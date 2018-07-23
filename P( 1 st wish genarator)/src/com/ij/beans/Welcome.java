package com.ij.beans;

import java.util.Date;

public class Welcome {
	private String name;
	private Date d;
public	Welcome()
{
	System.out.println("0 param cunstuctore");
}
	public void setName(String name) {
		this.name = name;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public String genrate( )
	{
		return "welcome"+name+"------->"+d;
	}

}
