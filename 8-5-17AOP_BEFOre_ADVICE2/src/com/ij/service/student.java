/**JAVA BOSS IRFAN @ COPYRIGHTS 2017 ALL RIGHTS RESERVED
 * 
 */
package com.ij.service;

/**
 * @author :IRFAN
 *DATE:09-May-2017
*TIME:12:12:29 PM
*TODO
 */
public class student {
	public void studentdetail (String name,int id){
		int count=0;
		System.out.println("welcome"+name+"your id is"+id);
		for (int a=1;a<99;a++){
			count++;
			demo d=new demo();
			System.out.println("demo_studentdetail"+count);
		}
		
		
	}
	public void studentfees(String classname,int fees){
		System.out.println("from 2 method");
		int count=0;
		for (int a=1;a<99;a++){
			count++;
			gemo f=new gemo();
			System.out.println("from gemo second method"+count);
		}
		
	}
	

}
