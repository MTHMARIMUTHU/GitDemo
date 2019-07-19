package Hexaware;

public class Person {
	
	int Id;
	String name;
	
	Person(int Id,String name){
		this.Id = Id;
		this.name = name;
		
	}
	
	public void displayDetails() {
		System.out.println("Employee Id is " + Id);
		System.out.println("Employee name is "+ name);
	}

}
