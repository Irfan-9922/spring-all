package com.ij.beans;

public class DTDC implements Courier {
	public DTDC()
	{
		System.out.println("0 param cunstuctor dtdc");
	}

	@Override
	public String Delevery(int orderid) {
		// TODO Auto-generated method stub
		return "Dtdc is ready to delevery productfrom product id"+orderid;
	}
	

}
