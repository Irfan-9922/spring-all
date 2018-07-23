package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



import com.ij.beans.bike;
import com.ij.beans.engin;
//import com.ij.beans.engin;
import com.ij.beans.vichel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating ioc container
		ApplicationContext ctx=null;
		ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		vichel s=ctx.getBean("s",vichel.class);
		System.out.println(s);
		engin s1=ctx.getBean("stud",engin.class);
		System.out.println(s1);
		bike b=ctx.getBean("bike",bike.class);
		System.out.println(b);

	}

}
