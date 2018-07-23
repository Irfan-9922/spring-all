package com.ij.beans;

import java.util.Date;

public class frind {
	private String firstname;
	private String lastname;
	private String sername;
	private Date d;
/*	public frind()
	{
		System.out.println("0 param cunstructor");
	}*/
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setSername(String sername) {
		this.sername = sername;
	}
	
public void setD(Date d) {
		this.d = d;
	}
public	String message()
{
	return "name::"+firstname+"\n last name::"+lastname+"\n sername::"+sername+"------>"+d;
}

}
