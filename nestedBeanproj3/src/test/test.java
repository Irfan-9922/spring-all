package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ij.beans.BankLoanApproval;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory pfactory=new XmlBeanFactory(new FileSystemResource("src/com/ij/cfg/web.xml"));
		
		BeanFactory cfactory=new XmlBeanFactory(new FileSystemResource("src/com/ij/cfg/approval web.xml"),pfactory);
		BankLoanApproval approver=cfactory.getBean("bla",BankLoanApproval.class);
		System.out.println(approver.approvloan());
		
	}

}
