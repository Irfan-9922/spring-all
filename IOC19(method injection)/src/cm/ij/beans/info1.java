package cm.ij.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class info1 implements MethodReplacer {
public int feess;
	public void setFeess(int feess) {
	this.feess = feess;
}
	public info1()
	{
		System.out.println("ooooooo");
	}
	@Override
	public Object reimplement(Object bean, Method method, Object[] arg)
			throws Throwable {
		Object phno=((Object)arg[0]);
		String name=((String)arg[1]);
		Object rollno=((Object)arg[2]);
		
		
		
		// TODO Auto-generated method stub
		return phno+name+rollno;
	}

}
