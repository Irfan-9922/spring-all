package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.DBOpretion;

public class client {
public static void main(String[] args) {
	ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
	DBOpretion db=ctx.getBean("hi", DBOpretion.class);
	System.out.println( db.registeremp(11,"irfan","programer",12334));
}
}
