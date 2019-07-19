package Hexaware;

public class Child extends Parent {
	
	
	public void display() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();

	}

}
