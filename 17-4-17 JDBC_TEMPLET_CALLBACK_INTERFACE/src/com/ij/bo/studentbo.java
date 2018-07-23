package com.ij.bo;
/**
 * @author irfan
   time:7-45-am
  project Name :simle insertion
 *
 */
public class studentbo {
	private String name;
	private int no;
	private String adress;
	
	public studentbo(String name, int no, String adress) {
		super();
		this.name = name;
		this.no = no;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

}
