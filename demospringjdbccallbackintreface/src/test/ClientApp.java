 package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.emservice.empserviceimpl;


public class ClientApp {

	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Service class
		empserviceimpl  service=(empserviceimpl) ctx.getBean("DBService");
       // perform persistence operations
	System.out.println("get record by no"+service.getbynum(4));
	System.out.println("get by job"+service.getbyjob("software dev"));
		
	}

}
