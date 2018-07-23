package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.Student_detail;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create ioc container
		ApplicationContext ctx=null;
		//ctx=FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		
	 ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
	 Student_detail st=ctx.getBean("stu",Student_detail.class);
	 System.out.println(st);
	
	}

}
