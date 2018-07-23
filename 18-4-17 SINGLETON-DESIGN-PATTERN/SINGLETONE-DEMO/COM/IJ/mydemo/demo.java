package COM.IJ.mydemo;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++){
		man m=man.getinstance();
		m.show();
System.out.println(m.hashCode());
		}

	}

}
