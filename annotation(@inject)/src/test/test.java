package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.engine;
import com.ij.beans.vichel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=null;
		ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		vichel v=ctx.getBean("vichel",vichel.class);
		System.out.println(v);
		

	}

}
