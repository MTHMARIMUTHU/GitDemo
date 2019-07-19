package Hexaware;

public class Customer {
	
	String customerId;
	String customerName;
	String address;
	String zipcode;
	
	public Customer(){
		customerId = "001";
		customerName = "TOM";
		address = "FL";
		zipcode = "12345";
		
	}
	
	public Customer(String customerId,String customerName,String address,String zipcode) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.zipcode = zipcode;
		
}
	
	public void display() 
	{
	
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(address);
		System.out.println(zipcode);
		
		
	}

}
