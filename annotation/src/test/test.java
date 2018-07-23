package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.robot;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the ioc container
		ApplicationContext ctx=null;
		//configuring the xml file
	                                  ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
	                                  robot r=ctx.getBean("robo",robot.class);
	                                  System.out.println(r);
		

	}

}
