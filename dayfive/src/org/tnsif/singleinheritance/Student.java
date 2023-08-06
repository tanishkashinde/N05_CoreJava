package org.tnsif.singleinheritance;

public class Student extends citizen {

private int rollNo;
private String collegeName;
public Student() {
super();

System.out.println("Childclass default constructor  ");
}


public Student(String city, int pincode, long aadharNo, long contactNo, int rollNo, String collegeName) {
	super(city, pincode, aadharNo, contactNo);
	this.rollNo=rollNo;
	this.collegeName=collegeName;
	// TODO Auto-generated constructor stub
}


public int getRollNo() {
	return rollNo;
}


public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}


public String getCollegeName() {
	return collegeName;
}


public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}


@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
}

	}


