package cm.ij.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class change implements MethodReplacer {
public int check;
	public void setCheck(int check) {
	this.check = check;
}
	public change()
	{
		System.out.println("0 mparam cunstuctor");
	}
	@Override
	public Object reimplement(Object bean, Method method, Object[] arg)
			throws Throwable {
		// TODO Auto-generated method stub
		
		int fees=((int)arg[0]);
		System.out.println(fees+"fees");
		int dues =((int)arg[1]);
		System.out.println(dues+"dues");
		return dues+fees*10;
	}

}
