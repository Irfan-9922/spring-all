package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.A;

public class test {
	public static void main(String[] args) {
		System.out.println("jkgjkg");
		//locate  spring bean confogration  file 
		FileSystemResource res=new FileSystemResource("src/com/ij/cfg/AppContext.xml");
		//activate bean factory container
		XmlBeanFactory factory =new XmlBeanFactory(res);
		//get bean class object
		A bean=factory.getBean("wsg", A.class);
	}

}
