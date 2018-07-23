package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.Bike;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the ioc container
		FileSystemResource res=new FileSystemResource("src/com/ij/cfg/web.xml");
		//creating the bean class object
		XmlBeanFactory factory=new XmlBeanFactory(res);
	//	Bike b=factory.getBean("hi",Bike.class);
		Bike b1=factory.getBean("hi1",Bike.class);
		Bike b2=factory.getBean("hi2",Bike.class);
		//System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
	}

}
