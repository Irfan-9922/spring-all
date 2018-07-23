package COM.IJ;

public class MOBILE {
	private String name;
	public MOBILE(String name, String os, int ram, int size, int camera_pixcel, int prise) {
		super();
		this.name = name;
		this.os = os;
		this.ram = ram;
		this.size = size;
		this.camera_pixcel = camera_pixcel;
		this.prise = prise;
	}
	public MOBILE() {
		// TODO Auto-generated constructor stub
	}
	private String os;
	private int ram;
	private int size;
	private int camera_pixcel;
	private int prise;
	public String getName() {
		return name;
	}
	public MOBILE setName(String name) {
		this.name = name;
		return this;
	}
	public String getOs() {
		return os;
	}
	public MOBILE setOs(String os) {
		this.os = os;
		return this;
	}
	public int getRam() {
		return ram;
	}
	public MOBILE setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public int getSize() {
		return size;
	}
	public MOBILE setSize(int size) {
		this.size = size;
		return this;
	}
	public int getCamera_pixcel() {
		return camera_pixcel;
	}
	public MOBILE setCamera_pixcel(int camera_pixcel) {
		this.camera_pixcel = camera_pixcel;
		return this;
	}
	public int getPrise() {
		return prise;
	}
	public MOBILE setPrise(int prise) {
		this.prise = prise;
		return this;
	}
	@Override
	public String toString() {
		return "MOBILE [name=" + name + ", os=" + os + ", ram=" + ram + ", size=" + size + ", camera_pixcel="
				+ camera_pixcel + ", prise=" + prise + "]";
	}
	public MOBILE getmobile(){
		return new  MOBILE(name,os, ram,size,  camera_pixcel, prise); 
	}

}
