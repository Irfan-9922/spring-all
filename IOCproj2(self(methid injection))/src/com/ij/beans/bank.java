package com.ij.beans;

public class bank {
	public float  intrest(float payment,float time)
	{
		return payment*time*100.0F;
	}
	public float loan(float payment,float ammount )
	{
		System.out.println("your payment is "+payment);
		System.out.println("your payment is "+ammount);
		return payment*ammount; 
	}

}
