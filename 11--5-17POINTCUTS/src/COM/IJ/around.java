/**JAVABOSS @COPYWRIGHTS ALL RIGHTS ARE RESERVED
 * 
 */
package COM.IJ;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author :IRFAN
 *TIME:2:21:19 am
 * DATE:11-May-2017
 *PROJECTNAME:11--5-17POINTCUTS
 */
public class around implements MethodInterceptor{

	/* (non-Javadoc)
	 * @see org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept.MethodInvocation)
	 */
	@Override
	public Object invoke(MethodInvocation f) throws Throwable {
		// TODO Auto-generated method stub
		long s,e;
		System.out.println("around start");
		s=System.currentTimeMillis();
		Object d=f.proceed();
		System.out.println("around end");
		e=System.currentTimeMillis();
		System.out.println("metohd takes "+(e-s)+"time to exicute");
		return d;
	}

}
