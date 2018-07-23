package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.delevry;

public class test {
	//System.out.println(super.getClass);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating th eioc container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		delevry d=ctx.getBean("hi",delevry.class);
		
		System.out.println(d.amazon("latur", "mobile", 10000));
	
	}

}
