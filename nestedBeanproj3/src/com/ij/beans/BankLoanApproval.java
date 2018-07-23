package com.ij.beans;

public class BankLoanApproval {
	private LoanDetail detail;
	
	public  BankLoanApproval()
	{
		System.out.println("0 param constructor  bnkaprvl");
	}
	public void setDetail(LoanDetail detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "BankLoanApproval [detail=" + detail + "]";
	}
	public String approvloan()
	
	{
		if(detail.getLoantype().equals("two wheeler"))
		{
			return "yes";
		}
		else
			return "fale";
	}

}
