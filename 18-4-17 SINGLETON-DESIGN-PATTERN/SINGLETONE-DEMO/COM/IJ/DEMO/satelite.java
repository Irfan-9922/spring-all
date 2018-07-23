package COM.IJ.DEMO;

public class satelite {
	private static satelite instance =new satelite();
	//make cunstructor as private then  this class can not be instatiate
	
private satelite(){
	
}
//get the only object available
public static satelite  getInstance(){
	return instance;
}
public void showmsg(){
	System.out.println("hello");
}
}
