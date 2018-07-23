package com.ij.service;

import java.util.Calendar;

public class approver {
	public String approvorder(int orderid){
		//get sysdate
		Calendar cal=Calendar.getInstance();
		int month=cal.get(Calendar.MONTH);
		if(month<2)
			return orderid+"your order is not approved";
		
		else
			return orderid+"approved";
	}

}
