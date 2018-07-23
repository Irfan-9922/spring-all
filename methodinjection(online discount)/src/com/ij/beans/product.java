package com.ij.beans;

public class product {
	public   Object mobile(String mname,int prise)
	{
		return mname+prise;
	}
	
	public Object laptop(String modelname,int prise,int discount)
	{
		return modelname+prise+discount;
	}
	public Object cloth(String brandname,int size,int prize)
	{
		
	
	return brandname+size+prize;

}
	public Object cloth1(String brandname,int size,int prize ,int batch)
	{
		
	
	return brandname+size+prize;

}
}