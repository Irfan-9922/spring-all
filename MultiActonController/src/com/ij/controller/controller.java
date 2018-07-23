package com.ij.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.ij.command.TestCommandController;

public class controller extends MultiActionController{
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res,TestCommandController cmd)
	{
		System.out.println(cmd.getNo());
		
		return new ModelAndView("user", "opretion","insertOpretion");
		
	}
	public ModelAndView update(HttpServletRequest req,HttpServletResponse res,TestCommandController cmd)
	{
		System.out.println(cmd.getNo());
		
		return new ModelAndView("user", "opretion","upadateOpretion");
		
	}
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse res,TestCommandController cmd)
	{
		System.out.println(cmd.getNo());
		
		return new ModelAndView("user", "opretion","deleteOpretion");
		
	}
	public ModelAndView invalid(HttpServletRequest req,HttpServletResponse res,TestCommandController cmd)
	{
		System.out.println(cmd.getNo());
		
		return new ModelAndView("user", "opretion","invalidOpretion");
		
	}

}
