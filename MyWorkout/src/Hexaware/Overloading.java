package Hexaware;

public class Overloading {
	
	public void add()
	{
		System.out.println("addition of two numbers");
	}
	
	
	public void add(int x,int y) {
		System.out.println (x+y);
		
	}
	
	public void add(int x,int y,int z) {
		int result = x+y+z;
		System.out.println(result);
	}	
	
	public double add(double x,double y) {
		double result = x+y;
		
		return result;
		
		
	}
	
	//public int add(int x,double y) {
		//int z = x + y;
		//return z;
	//}
	
	

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.add();
		obj.add(10,20,40);

	}

}
