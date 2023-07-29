package org.tnsif.dcisionmaking;
     import java.util.Scanner;

     public class Nested { 
	 Scanner s=new Scanner(System.in);
	 int age=s.nextInt();
	 int weight=s.nextInt();
	
	{
	if(age>=12)
			{
		if(weight>=40)
		{
			System.out.println("Eligible for bunjee jumping"); 
			if(weight>110) {
				System.out.println("extra ropes will be added");

			}
			else
			{
				System.out.println("not eligible");
			}
		}
		else
		{
			System.out.println("not eligible");
	
		}
	
			}}}

	
	


