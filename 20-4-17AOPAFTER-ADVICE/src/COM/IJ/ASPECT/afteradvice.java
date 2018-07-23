package COM.IJ.ASPECT;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Calendar;

import org.springframework.aop.AfterReturningAdvice;

public class afteradvice implements  AfterReturningAdvice{

	Calendar cal=Calendar.getInstance();
	int month=0;
	String msg=null;
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg, Object target) throws Throwable {
		// TODO Auto-generated method stub
		month=cal.get(Calendar.MONTH);
		if(month==1)
		{
			System.out.println(month);
		float billamt=(float) returnValue;
		if(billamt>6000)
			msg="you are illigsble for 30%discount";
		else if(billamt<6000 && billamt>4000)
			msg="you are illigsble for 20%discount";
		else if(billamt<4000 && billamt>3000)
			msg="you are illigsble for 10%discount";
		else
			msg="you are illigsble for 5%discount";
	}
	else
	{
		System.out.println("demooo");
	}
		//store discount in coupon
		FileWriter f=new FileWriter("cupon.txt",true);
		f.write(msg);
		f.flush();
	}

}
