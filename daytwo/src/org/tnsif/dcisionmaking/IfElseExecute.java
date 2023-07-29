package org.tnsif.dcisionmaking;
import java.util.Scanner;
public class IfElseExecute {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	int age=sc.nextInt();
	int weight=sc.nextInt();
	if(age>=18 && weight>=50)
	{
		System.out.println("eligible to donate blood");
	}
	
	else
	{
		System.out.println(" not eligible to donate blood");

	}
		
		
		
		
		
		
		
		

	}
}

