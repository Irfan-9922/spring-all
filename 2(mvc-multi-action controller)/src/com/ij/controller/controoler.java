package com.ij.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.http.HttpRequest;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class controoler extends  MultiActionController  {
	public ModelAndView insert(HttpRequest req,HttpServlet res)
	{
		return new ModelAndView("user","opretion","insertopretion");
		
	}
	public ModelAndView update(HttpRequest req,HttpServlet res)
	{
		return new ModelAndView("user","opretion","update topretion");
		
	}
	public ModelAndView delete(HttpRequest req,HttpServlet res)
	{
		return new ModelAndView("user","opretion","delete opretion");
		
	}
	public ModelAndView invalid(HttpRequest req,HttpServlet res)
	{
		return new ModelAndView("user","opretion","invlaidn opretion");
		
	}

}
