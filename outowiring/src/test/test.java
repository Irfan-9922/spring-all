package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.com;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the ioc container
		ApplicationContext ctx=null;
	ctx=new	FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		com c=ctx.getBean("c",com.class);
		System.out.println(c);

	}

}
