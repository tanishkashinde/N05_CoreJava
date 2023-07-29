package org.tnsif.Scanner;
import java.util.Scanner;

public class HwDoWhileLoop {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num= sc.nextInt();int count=0;
	
	do {
		  num = num /10;
		  count++;
	}
		
	 while(num!=0);
	 System.out .println("The number of digits in the number are:" + count);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
