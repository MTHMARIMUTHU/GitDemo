package OOPSConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,20);
		
		//you cannot create method inside a method
		//dulpicate method are not allowed, with same method name and same arguments
	
		
		
		}
	
	public void sum() {
		System.out.println("sum method");
	}
	
	public void sum(int i) {
		System.out.println("sum with one param");
	}
	
	public void sum(int x, int y) {
		System.out.println("sum with 2 param");
		System.out.println(x+y);
	}
}
