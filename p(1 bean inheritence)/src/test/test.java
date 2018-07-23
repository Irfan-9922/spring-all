package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.mobile;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the ioc container
		FileSystemResource res=new FileSystemResource("src/com/ij/cfg/web.xml");
		XmlBeanFactory  factory=new XmlBeanFactory(res);
		//mobile me =factory.getBean("hii",mobile.class);
		mobile m1=factory.getBean("hi",mobile.class);
      System.out.println(m1);
      mobile m2=factory.getBean("hiii",mobile.class);
      System.out.println(m2);
	}

}
