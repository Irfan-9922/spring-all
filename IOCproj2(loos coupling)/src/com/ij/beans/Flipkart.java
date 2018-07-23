package com.ij.beans;

import java.util.Random;

public class Flipkart {
	private Courier courier;
	public Flipkart()
	{
		System.out.println("0 param cunstuctor from fpk");
	}
	//setter method for the setter method injection
	public void setCourier(Courier courier) {
		System.out.println("flipcart courior");
		this.courier = courier;
	}
	 public String purches (String items[])
	 {
		 //genrate order id
		 Random rad=new Random();
		 int orderid=rad.nextInt(70000);
		 //delevery order
		 String status=courier.Delevery(orderid);
		 return status+"\n bill ammount for the id\n"+orderid+"\n is 70000";
	 }
	 
}
