package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.beans.product;

public class test {
    static 
    {
    	System.out.println("*********************welcome to the zoomba online store******************************");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the ioc conteiner
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/web.xml");
		product p=ctx.getBean("hi",product.class);
	//	product m=ctx.getBean("mrs",product.class);
	
		//System.out.println( "welcome to the "+p.mobile("lenovo vibe k5\n and prise of this moblie is  ", 6999));
	
		
//System.out.println(p.laptop("dell inspiron 125", 25555, 1000));
	System.out.println(p.mobile("motorola", 29));
	System.out.println(p.cloth("irfan", 12,1222));
	//System.out.println(p.mobile("lg", 10000, 1000));
		
	}

}
