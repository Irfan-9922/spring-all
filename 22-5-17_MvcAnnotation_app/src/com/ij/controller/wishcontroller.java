/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ij.view.Wishservice;

/**
 * @author :IRFAN
 *TIME:5:02:12 am
 * DATE:22-May-2017
 *PROJECTNAME:22-5-17_MvcAnnotation_app
 */
@Controller
public class wishcontroller {
	@Resource
	private Wishservice service;
	@RequestMapping("/wish.htm")
	public ModelAndView process(){
		String ms=service.msg();
		
		return new ModelAndView("result","wmsg",ms);
		
	}

}
