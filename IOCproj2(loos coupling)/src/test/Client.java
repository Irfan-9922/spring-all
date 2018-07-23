package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.Flipkart;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//genrate ioc cointainer
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/ij/cfg/web.xml"));
Flipkart bean=factory.getBean("fpk",Flipkart.class);
factory.getBean("fpk");
String billmsg=bean.purches(new String[]{"shirt","pant","mobile","book"});
//String billnsg=bean.purches(items)

System.out.println(billmsg);
	}

}
