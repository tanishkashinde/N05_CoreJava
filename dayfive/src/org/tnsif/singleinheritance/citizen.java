package org.tnsif.singleinheritance;
//base class
public class citizen {

	private String city;
	private int pincode;
	private long aadharNo;
	private long contactNo;
	public String getCity() {
		return city;
	}
	
	//paramertized 
	
	public citizen(String city, int pincode, long aadharNo, long contactNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.aadharNo = aadharNo;
		this.contactNo = contactNo;
		System.out.println("Parameterized constructor");
	}



	//getters and setters
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public citizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "citizen [city=" + city + ", pincode=" + pincode + ", aadharNo=" + aadharNo + ", contactNo=" + contactNo
				+ "]";
	}
	
	
	
}
