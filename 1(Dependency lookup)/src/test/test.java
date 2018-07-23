package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.oly;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory fact=new XmlBeanFactory(new FileSystemResource("src/com/ij/cfg/AppContext.xml"));
		oly ol=fact.getBean("ol",oly.class);
		
		ol.call();
		oly ol1=fact.getBean("ol",oly.class);
				ol.call();
				System.out.println("cheking the scop");
				System.out.println(ol.hashCode()+"scop"+ol1.hashCode());
				System.out.println("");
				System.out.println(ol==ol1);

	}

}
