package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.frind;

public class result {
	public static void main(String a[])

	{
		//regester the bean configration file to the bean classes

	
	FileSystemResource res=new FileSystemResource("src/com/ij/cfg/AppContext.xml");
	//creating factory bean class object
	XmlBeanFactory factory=new XmlBeanFactory(res);
	frind bean=factory.getBean("hi", frind.class);
	String  re=bean.message();
	System.out.println(re);
	}
	

}
