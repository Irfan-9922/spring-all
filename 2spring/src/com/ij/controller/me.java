package com.ij.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class me implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		String name=null;
		String addrs="faradapur";
		name="irfan";
		
		// TODO Auto-generated method stub
		return new ModelAndView("arth","name",name);
	}

}
