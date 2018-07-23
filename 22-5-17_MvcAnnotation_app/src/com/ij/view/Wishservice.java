/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.view;

import java.util.Calendar;

import javax.inject.Named;

/**
 * @author :IRFAN
 *TIME:4:36:36 am
 * DATE:22-May-2017
 *PROJECTNAME:22-5-17_MvcAnnotation_app
 */
@Named("ws")
public class Wishservice {

public String msg(){
	Calendar cl=Calendar.getInstance();
	String msg=null;
	
	 int hour =cl.get(Calendar.HOUR_OF_DAY);
	 if(hour<=12)
		 msg="good morning";
	 else if(hour<15)
		 msg="good evivnig";
	 else 
		 msg="good night";
	 return msg;
	
}
}
