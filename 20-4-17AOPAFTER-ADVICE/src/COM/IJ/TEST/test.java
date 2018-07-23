package COM.IJ.TEST;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

import COM.IJ.SERVICE.cupon;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/COM/IJ/CFG/applicationContext.xml");
    cupon proxy=(cupon) ctx.getBean("bean");
  float billamt=proxy.calbill("jenas", 7000, 3);
  System.out.println("bill amt"+billamt);
    
	}

}
