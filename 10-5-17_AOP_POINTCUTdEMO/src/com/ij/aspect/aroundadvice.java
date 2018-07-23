/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author :IRFAN
 *TIME:2:33:52 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17_AOP_POINTCUTdEMO
 */
public class aroundadvice implements MethodInterceptor{

	/* (non-Javadoc)
	 * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept.MethodInvocation)
	 */
	@Override
	public Object invoke(MethodInvocation dd) throws Throwable {
		// TODO Auto-generated method stub
		long s,e;
		s=System.currentTimeMillis();
		System.out.println("inside advice class before method exicute");
		Object d=dd.proceed();
		System.out.println("inside advice class after method exicute");
		return d;
	}

}
