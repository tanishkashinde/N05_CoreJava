package org.tnsif.superkeyword;
class Sports
{
String Xyz="";
void display()
{
	System.out.println("sports name is :" +Xyz);
}
	
	
}
class Cricket extends Sports
{
	String noOfPlayers="";
	void display()
	{
		/*if parent and child class mathods  are same and if we want to call parent class mathod inside the class then use super.methodname(*/ 
		
		super.display();
		System.out.println("no of players:" +noOfPlayers);
	}
	
	
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		Cricket c=new Cricket();
		c.display();
		
		
		
		
	}

}
