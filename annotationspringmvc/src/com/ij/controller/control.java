package com.ij.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ij.service.ser;

@Controller
public class control  {
	@Resource
	public ser sr;

	@RequestMapping("/wish.htm")
	public void  prosses(Model model){
		String msg=sr.getTimeAndWishMsg();
	model.addAttribute("mswg",msg);
		
	}
}
