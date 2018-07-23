package com.ij.beans;

import java.util.Random;

public class snapdeal {
	private Couriorcompany company;
	public snapdeal()
	{
		System.out.println("from the cunstructor  of snapdeal");
	}
	public void setCompany(Couriorcompany company) {
		this.company = company;
	}
	public String  purchs(String[] items)
	{
		Random rm=new Random();
		int orderid=rm.nextInt(6);
		 String status=company.delivery(orderid);
		 return status+"\n bill ammount for the id\n"+orderid+"\n is 6000";
	}
	
}
