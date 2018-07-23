package com.ij.beans;

public class BlueDart implements Courier{
	public BlueDart()
	{
		System.out.println("0 param cunstrctor blue dart");
	}

	@Override
	public String Delevery(int orderid) {
		// TODO Auto-generated method stub
		return "blue dart is ready to deleveryof products\n your delevery order no is\n"+orderid;
	}
	

}
