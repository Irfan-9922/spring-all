package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.bean.tclass;




public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BeanFactory factory =new XmlBeanFactory(new FileSystemResource("src/com/ij/cfg/web.xml"));
		
		tclass age=factory.getBean("t1",tclass.class);
		System.out.println(age);
	}

}
