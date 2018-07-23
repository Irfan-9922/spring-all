package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cm.ij.beans.info;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml"); 
		info b=ctx.getBean("b",info.class);
		System.out.println("detail"+b.detail(1212, 98));
	//	if()
		System.out.println("contacat"+b.contact(9, 8));
	System.out.println(b.feess(9, "irfan", 2));

	}
}
