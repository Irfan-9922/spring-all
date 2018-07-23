package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.targate;




public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory factory =new XmlBeanFactory(new FileSystemResource("src/com/ij/cfg/web.xml"));
		
		targate age=factory.getBean("t1",targate.class);
		System.out.println(age);
	}

}
