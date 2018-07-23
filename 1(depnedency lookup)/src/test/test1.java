package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.vichel1;
import com.ij.beans.engine;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			BeanFactory fact=new XmlBeanFactory(new FileSystemResource("src/com/in//cfg/AppContext.xml"));
		/*	vichel e2=fact.getBean("vl",vichel.class);
			e2.start();
*/
			vichel1 e2=fact.getBean("vl",vichel1.class);
			e2.start();
		}

	}


