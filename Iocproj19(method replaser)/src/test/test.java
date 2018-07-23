package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.bank;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/config/web.xml");
      //get bean
		bank b=ctx.getBean("b",bank.class);
	//	System.out.println(bank.getClass());
		System.out.println(b);
		System.out.println(bank.class+"");
		System.out.println(b.cal(10000,20));
	}

}
