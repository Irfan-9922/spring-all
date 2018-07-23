package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.engine;
import com.ij.beans.vichel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory fact=new XmlBeanFactory(new FileSystemResource("src/com/ij//cfg/AppContext.xml"));
		vichel e1=fact.getBean("vi",vichel.class);
		e1.move();

	}

}
