package com.ij.service;

import java.util.Calendar;

public class service {
	public String getTimeAndWishMsg(){
		Calendar cal=Calendar.getInstance();
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		String msg=null;
		if(hour<=12)
		{
			return msg="good morning";
		}
		else if(hour<=20)
		{
		return	msg="good evining";
		}
		else
		return	msg="good night";
		
	}
	

}
