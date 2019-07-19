package Hexaware;

public class TestCustomer {

	public static void main(String[] args) {
		Customer obj1 = new Customer();
		Customer obj2 = new Customer("Emp1","Jerry","123 Street","20166");
		
		obj1.display();
		System.out.println("*********************");
		obj2.display();

	}

}
