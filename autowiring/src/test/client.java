package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.travelagent;

public class client {

	public static void main(String[] args) {
		//creste ioc cntainer
		BeanFactory factory =new XmlBeanFactory(new FileSystemResource("src/com/ij/cfg/web.xml"));
		
		travelagent age=factory.getBean("t1",travelagent.class);
		System.out.println(age);
		// TODO Auto-generated method stub

	}

}
