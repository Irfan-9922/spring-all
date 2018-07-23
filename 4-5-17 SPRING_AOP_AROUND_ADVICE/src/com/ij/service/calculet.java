package com.ij.service;

public class calculet  {
	public float hikesal(float sal,float time){
		if(sal<10000 && time <2)
		return (sal*time)/100.f;
		else
			return (sal*time);
	}
	public float purches(String item,float prise,int qty)
	{
		return prise*qty;
	}

}
