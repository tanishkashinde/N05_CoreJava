package org.tnsif.statickeyword;

public class StaticMethod {

	int x=2;
	static String collagename="MET";
	// if any methid outside the min function if you ant to acess the method inside the main function have to make that method in static
	
	
	public static void print()
	{
		System.out.println(collagename);
		
		//we cant use non static variable inside any static method
		//System.out.println(x);
		
		
	}
	public static void main(String[] args) {
print();
	}

}
