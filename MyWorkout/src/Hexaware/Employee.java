package Hexaware;

public class Employee extends Person {
	
	double salary;
	
	Employee(int Id,String name,double salary){
		
		
		super(Id,name);
		this.salary = salary;
		
		
	}
	
	//Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee salary is "+ salary);
	}

	public static void main(String[] args) {
		
		Employee emp = new Employee(1,"Tom",8123);
		emp.displayDetails();
		

	}

}
