package comm.ij.beans;

public class vichel {
	private engin eng;
	public void setEng(engin eng) {
		this.eng = eng;
	}

	public void setF(String f) {
		this.f = f;
	}

	private String f;
	
	
	
	
	
	public vichel(engin eng) {
		
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "vichel [eng=" + eng + "]";
	}

}
