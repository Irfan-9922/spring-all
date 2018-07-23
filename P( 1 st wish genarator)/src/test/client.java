package test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.Welcome;

public class client {
	public static void main(String[] args) {
	//locate the xml file
	FileSystemResource rs=new FileSystemResource("src/com/ij/cfg/web.xml");
	//creating the ioc conteiner object
	XmlBeanFactory factory=new XmlBeanFactory(rs);
	Welcome bean=factory.getBean("wsgh",Welcome.class);
	String result=bean. genrate();
	System.out.print(result);
}
	/*String result=bean.genrateWishmsg();
	 * 	WishGenrator bean=factory.getBean("wsg", WishGenrator.class);
	 * XmlBeanFactory factory =new XmlBeanFactory(res);
	System.out.println(result);
	*/


}
