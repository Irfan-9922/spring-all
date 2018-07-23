package com.ij.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class result implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		Calendar cal=Calendar.getInstance();
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		String wmsg=null;
		if(hour<=12)
		{
			wmsg="good morning";
		}
		else if(hour<=18)
		{
			wmsg="good evining";
		}
		else
		{
			wmsg="good night";
		}
		// TODO Auto-generated method stub
		return new ModelAndView("result","wmsg",wmsg);
	}

}
