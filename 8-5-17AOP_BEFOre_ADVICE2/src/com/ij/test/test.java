/**JAVA BOSS IRFAN @ COPYRIGHTS 2017 ALL RIGHTS RESERVED
 * 
 */
package com.ij.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ij.service.student;

/**
 * @author :IRFAN
 *DATE:09-May-2017
*TIME:12:27:15 PM
*TODO
 */
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/ij/cfg/applicationContext.xml");
		System.out.println("2");
    student proxy=(student) ctx.getBean("around");
    
		System.out.println("3");
		proxy.studentdetail("irfan", 12);
		proxy.studentfees("lkg", 2000);
		System.out.println("4");
		


	}

	
}
