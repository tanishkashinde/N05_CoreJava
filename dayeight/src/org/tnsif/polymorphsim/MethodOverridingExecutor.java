package org.tnsif.polymorphsim;

import java.util.Scanner;

class Laptop
{
String generation="Intel I5 11th generation";
void specification(String generation1,String generation2)
{
	System.out.println("Laptop: "+generation)	;

}
}
class Asus extends Laptop
{
	String generation1,generation2;
	 void specification(String generation1,String generation2)
	{
		super.specification(generation1,generation2);
		System.out.println("Asus: "+generation2)	;

	}
	 }
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Asus a=new Asus();		

		
		String generation1=s.nextLine();
		String generation2=s.nextLine();

		a.specification(generation1,generation2);

	}

}
