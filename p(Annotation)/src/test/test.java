package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.vichel;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=null;
		ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		//vichel v=ctx.getBean("v",vichel.class);
		vichel v1=ctx.getBean("eng",vichel.class);
		System.out.println(v1);
		vichel v2=ctx.getBean("eng",vichel.class);
		System.out.println(v2+"........"+v2.hashCode());
		vichel v3=ctx.getBean("eng",vichel.class);
		System.out.println(v3+"......."+v3.hashCode());
		

	}

}
