package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.team;
import com.ij.beans.vichel;

public class teamDetail {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the ioc container
		ApplicationContext ctx=null;
	/*ctx=new 	FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		*/
	       ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		vichel te=ctx.getBean("sin",vichel.class);
		System.out.println(te);
	
	}

}
