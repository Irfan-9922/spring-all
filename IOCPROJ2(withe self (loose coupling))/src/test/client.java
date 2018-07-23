package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.snapdeal;

public class client {

	public static void main(String[] args) {
		System.out.println("from main method ");
		//creating th ebean factory obj //ioc cotainer
		BeanFactory factory =new XmlBeanFactory(new FileSystemResource("src/com/ij/cfg/web.xml"));
		
		snapdeal bean=factory.getBean("snap",snapdeal.class);
	//	factory.getBean("sanp");
		String billmsg=bean.purchs(new String []{"shirt","pant","laptop"});
		System.out.println(billmsg);
		//
		
		
		
		
		// TODO Auto-generated method stub

	}

}
