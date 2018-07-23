package COM.IJ;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo("irfan", 23);
		System.out.println(d.hashCode());

		System.out.println(d.getName());
		System.out.println(d.getAge());
	 d=new demo("nisar", 11);
	 System.out.println(d.hashCode());
		System.out.println(d.getName());
		System.out.println(d.getAge());
		
	}

}
