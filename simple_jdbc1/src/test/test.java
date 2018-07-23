package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import service.empservice;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/config/applicationContext.xml");
     empservice service=(empservice) ctx.getBean("start");
     //call b method
     System.out.println(service.getsinglevalue(9384));
     System.out.println(service.singlerecord(9384));
     

	}

}
