package com.ij.beans;

public class sports {
	public sports()
	{
		System.out.println("0 param constructor from sports");
	}
	public void cricket()
	{
		System.out.println("cricket is the most playe game in india");
		odi();
		test();
	}
	
public void odi()
{
	String cap="msd";
	String vcap="virat";
	System.out.println(cap+""+vcap);
}
public void test()
{
	String cap="virat";
	String vcap="sharma";
	System.out.println(cap+""+vcap);
}
public void football()
{
	System.out.println("this is the world class game");
	ileage();
	champion();
	
}
public void ileage()
{
	System.out.println("this indian football league");
	String cap="jojo";
	String vcap="chatri";
	System.out.println(cap+""+vcap);
}
public void champion()
{
	System.out.println("this is the euopan leage");
	String cap="messi";
	String vcap="ronaldo";
	System.out.println(cap+""+vcap);
}
}
