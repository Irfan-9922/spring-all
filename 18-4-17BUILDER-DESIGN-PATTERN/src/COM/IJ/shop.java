package COM.IJ;

public class shop {
	private String books;
	private String soap;
	private String oil;
	 private String shampoo;
	 private String buiscit;
	 private String choklet;
	public String getBooks() {
		return books;
	}
	public shop setBooks(String books) {
		this.books = books;
		return this;
	}
	public String getSoap() {
		return soap;
	}
	public shop setSoap(String soap) {
		this.soap = soap;
		return this;
	}
	public String getOil() {
		return oil;
	}
	public shop setOil(String oil) {
		this.oil = oil;
		return this;
	}
	public String getShampoo() {
		return shampoo;
	}
	public shop setShampoo(String shampoo) {
		this.shampoo = shampoo;
		return this;
	}
	public String getBuiscit() {
		return buiscit;
	}
	public shop setBuiscit(String buiscit) {
		this.buiscit = buiscit;
		return this;
	}
	public String getChoklet() {
		return choklet;
	}
	
	public shop(String books, String soap, String oil, String shampoo, String buiscit, String choklet) {
		super();
		this.books = books;
		this.soap = soap;
		this.oil = oil;
		this.shampoo = shampoo;
		this.buiscit = buiscit;
		this.choklet = choklet;
	}
	public shop(){}
	public shop setChoklet(String choklet) {
		this.choklet = choklet;
		return this;
	}
	 
	public shop getshop(){
		return new shop(books,soap, oil, shampoo, buiscit, choklet);
	}
	@Override
	public String toString() {
		return "shop [books=" + books + ", soap=" + soap + ", oil=" + oil + ", shampoo=" + shampoo + ", buiscit="
				+ buiscit + ", choklet=" + choklet + "]";
	}

}
