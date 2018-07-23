package com.ij.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class diwaliOffer implements MethodReplacer {
	public int mo;
	public int lap;
	/*public void setClo(int clo) {
		this.clo = clo;
	}*/

	public int clo;
	@Override
	public Object reimplement(Object bean, Method method, Object[] arg)
			throws Throwable {
		String mname=((String)arg[0]);
		int prise =((int)arg[1]);
		return mname+prise+9000;
	}
		
		
	/*public void setOffer(int offer) {
		this.offer = offer;
	}


	public int offer;
	public int discount;
	public int lappy;
	public void setLappy(int lappy) {
		this.lappy = lappy;
	}


	public void setClothing(int clothing) {
		this.clothing = clothing;
	}


	public int clothing;
	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public diwaliOffer()
	{
		System.out.println("0 param cunstructor");
	}

	
	@Override
	public Object reimplement(Object bean, Method method, Object[] arg)
			throws Throwable {
		
		
	
		// TODO Auto-generated method stub
		String pname=((String)arg[0]);
		int prise=((int )arg[1]);
		System.out.println("today is the divali offer so you save upto 10%");
		return pname+(prise-1000);
		
	
		
			String mname=((String)arg[0]);
			int prize=((int)arg[1]);
			int discount=((int)arg[2]);
			return mname+prise+discount ;
		
	
			String model =((String)arg[0]);
			int prise=((int)arg[1]);
			int discount=((int)arg[2]);
			return model+prise+discount;
		
		
			String brandname=((String)arg[0]);
			int size =((int )arg[1]);
			int prize1=((int)arg[2]);
			return brandname+size+prize1;
					
		
		
	
	}*/

/*	public void setLap(int lap) {
		this.lap = lap;
	}
*/
	public void setMo(int mo) {
		this.mo = mo;
	}
	
}
