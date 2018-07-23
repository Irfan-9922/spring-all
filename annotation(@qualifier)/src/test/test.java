package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.viche;

public class test {
	

		public static void main(String[] args) {
		   //create IOC Container
			ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
			//get Bean
	      viche viechle=ctx.getBean("viechle",viche.class);
			System.out.println(viechle);
		}//main
	}//class


