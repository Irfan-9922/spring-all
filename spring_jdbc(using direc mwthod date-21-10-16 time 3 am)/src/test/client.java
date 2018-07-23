package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.Student_Service;

public class client {
	public static void main(String[] args) {
		//activate the ioc container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		Student_Service service=ctx.getBean("start", Student_Service.class);
		//System.out.println(service.insert_Rcord("nisar", "jalil", "jarina", "softdev", 1));
		System.out.println(service.getrecordbysal(1));
	}

}
