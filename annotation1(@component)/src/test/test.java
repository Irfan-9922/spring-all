package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.mayfriends;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the ioc conteiner
		AbstractApplicationContext ctx=null;
	ctx=new 	FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		mayfriends ss=ctx.getBean("simple",mayfriends.class);
		System.out.println(ss);

	}

}
