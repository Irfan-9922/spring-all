package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.bank;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the ioc container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		//get bean
		bank b=ctx.getBean("b",bank.class);
		System.out.println();
		System.out.println("loan method"+b.loan(101,121));
		System.out.println("intrest method"+b.intrest(99f, 20f));

	}

}
