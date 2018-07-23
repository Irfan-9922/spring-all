package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.empServiceimpl;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/cmo/ij/cfg/applicationContext.xml");
           //get servis class
		empServiceimpl service=(empServiceimpl) ctx.getBean("start");
		System.out.println("getrecord by no"+service.getbyno(4));
		System.out.println("get record by job"+service.getbyjob("software dev"));
	}

}
