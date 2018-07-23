package com.ij.beans;

public class fastdragun implements Courier{

	@Override
	public String Delevery(int orderid) {
		System.out.println("fastdragun is ready to delevery");
		// TODO Auto-generated method stub
		return "fastdragun is ready to delevery"+orderid;
	}
	public void name()
	{
		System.out.println("from name");
	}
	
	

}
