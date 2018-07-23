package com.ij.trial;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class wishcontroller  implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
	
		Calendar cal=Calendar.getInstance();
				int h=cal.get(Calendar.HOUR_OF_DAY);
				String msg=null;
				if(h<=12)
				{
					msg ="good morning";
					
				}
				else if(h<=16)
				{
					msg="good after noon";
				}
				else{
					msg="good night";
				}
		
				
		
		
		// TODO Auto-generated method stub
		return new ModelAndView("result","msg",msg);
	}

}
