package Hexaware;

public class TEST_Exception {

	public static void main(String[] args) {
		
		try {
		
		int [] arr = {1,2};
		arr[2] = 0;
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("divide by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}

	}

}
