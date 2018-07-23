package test;
import com.ij.service.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in0client");
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfgs/applicationContext.xml");
		System.out.println("1 client");
		empserviceimpl se=(empserviceimpl) ctx.getBean("irfan");
		System.out.println("in2 client");
		System.out.println(se.getbyNO(11));
		System.out.println(se.getAll("clerk"));
		System.out.println("in3 client");

	}

}
