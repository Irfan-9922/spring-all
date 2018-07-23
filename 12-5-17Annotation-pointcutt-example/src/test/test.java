/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.student;

/**
 * @author :IRFAN
 *TIME:6:55:52 am
 * DATE:11-May-2017
 *PROJECTNAME:12-5-17Annotation-pointcutt-example
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/apllicationContext.xml");
   student proxy=(student) ctx.getBean("target");
   System.out.println();
   proxy.go();
   proxy.come();
	}

}
