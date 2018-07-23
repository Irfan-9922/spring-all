package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import comm.ij.beans.vichel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory =new XmlBeanFactory(new FileSystemResource("src/com/ij/cfg/web.xml"));
	//	ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		vichel v=factory.getBean("vi",vichel.class);
		System.out.println(v);

	}

}
