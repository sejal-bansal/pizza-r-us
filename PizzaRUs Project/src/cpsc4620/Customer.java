package cpsc4620;

public class Customer 
{
	
	/*
	 * 
	 * Standard Java object class. 
	 *  
	 * This file can be modified to match your design, or you can keep it as-is.
	 * 
	 * */
	
	private int CustomerID;
	private String FName;
	private String LName;
	private String Phone;
	private String Address;
	
	
	public Customer(int customerId, String fName, String lName, String phone) {
		CustomerID = customerId;
		FName = fName;
		LName = lName;
		Phone = phone;
	}

	public int getCustID() {
		return CustomerID;
	}

	public String getFName() {
		return FName;
	}

	public String getLName() {
		return LName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setCustID(int customerId) {
		CustomerID = customerId;
	}

	public void setFName(String fName) {
		FName = fName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
	

	
	@Override
	public String toString() {
		return "CustID=" + CustomerID + " | Name= " + FName +  " " + LName + ", Phone= " + Phone;
	}
	
	
}
