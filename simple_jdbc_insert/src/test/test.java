package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.empdto.empdto;
import com.ij.empservice.empserviceimpl;

public class test {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/cmo/ij/cfg/applicationContext.xml");
		//call the service 
		empserviceimpl service=(empserviceimpl) ctx.getBean("irfan");
		//claa the business method
		empdto dto=new empdto(90, "ram", "ir", 121);
		//System.out.println("insert record"+service.insert(9, "iefan", "s/w dev", 12132));
		System.out.println("using dto object"+service.insert(dto));
	}

}
