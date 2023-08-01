package org.tnsif.superkeyword;
//parent class
class State 
{
	String statename="Punjab";
	
	
}
//child class
class Capital extends State
{
	String statename="Hariyana";
	String capital="Candigarh";
	
	public void display()
	{
		System.out.println("super.statement");//punjab

		System.out.println("statement");//hariyana

	}
}
//driver class
public class SuperKeywordWithVariable {

	public static void main(String[] args) { 
		Capital c=new Capital();
		c.display();
		

		
		
	}

}
