/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.service;

/**
 * @author :IRFAN
 *TIME:4:15:27 am
 * DATE:11-May-2017
 *PROJECTNAME:11-5-17Annotation-advice
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/apllicationContext.xml");
	service proxy=(service) ctx.getBean("target");
proxy.run();
	
	}

}
