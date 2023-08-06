
package org.tnsif.polymorphsim;

import java.util.Scanner;

class BollyWood 
{
	String str1,str2,str3;
	static void display(String str1,String str2)
	{
		System.out.println(str1+" loves "+str2);
		
	}
	static void display(String str1,String str2,String str3)
	{
		System.out.println(str1+" loves "+str2 +"as well as"  +str3);
		
	}
}

public class MethodOverloadingExecutor {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter three strings:");

		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		BollyWood.display(str1, str2);
		BollyWood.display(str1, str2, str3);

		
	}

}
