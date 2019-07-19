package Hexaware;

public class TestException {

	public static void main(String[] args) {
		
		
		
		
		try {
			
			int x=6;
			int y=0;
			int z = x/y;
			System.out.println("result is" + z);
			
		}
		
		catch(ArithmeticException m) {
			System.out.println("exception caught" + m);
			
		}
		
		

	}

}
