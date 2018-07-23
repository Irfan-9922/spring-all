package com.ij.beans;

public class LoanDetail {
	private int loanid;
	private String loantype;
	private String customer;
	public LoanDetail()
	{
		System.out.println("0 param constructor");
	}
	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getLoanid() {
		return loanid;
	}

	public String getLoantype() {
		return loantype;
	}
	public String getCustomer() {
		return customer;
	}
	@Override
	public String toString() {
		return "LoanDetail [loanid=" + loanid + ", loantype=" + loantype
				+ ", customer=" + customer + "]";
	}

}
