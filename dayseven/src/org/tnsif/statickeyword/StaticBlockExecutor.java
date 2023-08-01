package org.tnsif.statickeyword;

public class StaticBlockExecutor {

	static float salary;
	String companyname;
	
	
	//static block is ue=sed to initialized the static variable we cant assign the value for any non static variable inside the static block
	static
	{
	//	companyname="Accenture"
				salary=67347.63f;
		
	}
	
	//static mathod
	
	static void print()
	{
		System.out.println(salary);
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

	}

}
