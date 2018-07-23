package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.empServiceimpl;



public class test {
	public static void main(String[] args) throws Exception {
		
		
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/applicationContext.xml");
		//get the service bean
			empServiceimpl ss=(empServiceimpl) ctx.getBean("irfan");
			System.out.println("insertded record"+ss.put(4, "nisar", "software dev", 342));
			System.out.println("get emp detail"+ss.singleRecord(4));
			System.out.println("get emp sal"+ss.singlevale(1));
		//	System.out.println("refdd"+ss.remove(77));
			System.out.println("get emp detail"+ss.allemp());
	}
	
	
}
