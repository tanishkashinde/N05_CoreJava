package org.tnsif.dcisionmaking;
import java.util.Scanner;
public class SwitchExecution {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int songno=sc.nextInt();
		switch(songno) {
		case 1:
		 System.out.println("Perfect");
		 break;
		case 2:
		 System.out.println("oo antava");
		 break;
		case 3:
			 System.out.println("taki taki");
			 break;
			 default:
				 System.out.println("invalid input");

		}
		
	}	
		
	
		

	

}
