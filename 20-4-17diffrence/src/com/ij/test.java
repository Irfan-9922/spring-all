package com.ij;

import java.util.Calendar;
import java.util.Scanner;

public class test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long start,end;
	int mon=12;
	
		Calendar cal=Calendar.getInstance();
		System.out.println("enter the your birth year");
		int start1=sc.nextInt();
		System.out.println("enter your birth month:");
		int bmon=sc.nextInt();
		int ct=mon-bmon;
		int current=cal.get(Calendar.YEAR);
		System.out.println("your bate of birth::::"+start1);
		System.out.println("this year::"+current);
		System.out.println("now your age is "+(current-start1));
		System.out.println("now your age is "+(current-start1)+"year  you livle in earth");
		//System.out.println("now your age is "+(current-start1)*mon*30+"day  you are live in this earth");
	//	System.out.println("now your age is "+(current-start1)*mon*24*60+"minuts you spend in earth");
		start=System.currentTimeMillis();
		int s=24*60;
		System.out.println("sssss"+s);
		System.out.println("hello this is demo");
		try{
			Thread.sleep(700);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
   end=System.currentTimeMillis();
   System.out.println("program takes time to exicute "+(end-start)+"seconds");
	}

}
