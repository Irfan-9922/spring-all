package COM.IJ.mydemo;

public class man {
 static man instance;
	private man(){}

	public  static man getinstance(){
		if(instance==null){
			instance=new man();
		}
		return instance;
	}
	public void show()
	{
		System.out.println("hello");
	}
}
