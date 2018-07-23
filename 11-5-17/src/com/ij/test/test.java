/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.calculet;

/**
 * @author :IRFAN
 *TIME:4:46:47 am
 * DATE:11-May-2017
 *PROJECTNAME:11-5-17
 */
public class test {
	public static void main(String[] args) {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/apllicationContext.xml");
				calculet proxy=(calculet) ctx.getBean("target"); 
			
				System.out.println(proxy.sum(11, 11));
				System.out.println(proxy.dev(11, 11));
				System.out.println(proxy.mul(0, 11));
				System.out.println(proxy.sub(11, 1));
				
				
				
				
	}

}
