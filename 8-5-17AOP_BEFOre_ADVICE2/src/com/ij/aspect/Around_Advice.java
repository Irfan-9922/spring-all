/**JAVA BOSS IRFAN @ COPYRIGHTS 2017 ALL RIGHTS RESERVED
 * 
 */
package com.ij.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author :IRFAN
 *DATE:09-May-2017
*TIME:12:17:24 PM
*TODO
 */
public class Around_Advice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation ar) throws Throwable {
		// TODO Auto-generated method stub
		long start,end;
		start=System.currentTimeMillis();
		Object demo=ar.proceed();
		end=System.currentTimeMillis();
		System.out.println(ar+"method taking "+(end-start)+"time to complete the exicution");
		return demo;
	}

}
