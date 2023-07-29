//program to demonstrate ternary operator
package org.tnsif.oparey;
import java.util.Scanner;

public class ternaryoperator {

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
int num=s.nextInt();
String res=(num%2==0)?"Even":"Odd";
System.out.println("Result is: "+res);
s.close();

}
}
