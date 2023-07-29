package org.tnsif.loppingstatement;
import java.util.Scanner;
public class DoWhileExcutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		do {
			  System.out.println("Value of n is :" +n);
		n++;
		
	}
	while(n<14);
	
	}

}
