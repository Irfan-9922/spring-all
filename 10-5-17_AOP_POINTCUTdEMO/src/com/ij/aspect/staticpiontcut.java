/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package com.ij.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.ij.service.calculet;

/**
 * @author :IRFAN
 *TIME:2:28:17 pm
 * DATE:10-May-2017
 *PROJECTNAME:10-5-17_AOP_POINTCUTdEMO
 */
public class staticpiontcut extends StaticMethodMatcherPointcut{

	/* (non-Javadoc)
	 * @see org.springframework.aop.MethodMatcher#matches(java.lang.reflect.Method, java.lang.Class)
	 */
	@Override
	public boolean matches(Method m, Class<?> target) {
		// TODO Auto-generated method stub
		if(target==calculet.class && m.getName().equals("mul"))
			return true;
		else
		return false;
	}

}
