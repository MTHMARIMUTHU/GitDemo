
public class IfElse {

	public static void main(String[] args) {
		
		//if else
		int a = 10;
		int b = 20;
		int c = 30;
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		System.out.println("******************");
	
	//comparison operator---> < > <= >= == !=
	//nested if-else
		if(a>b & a>c) {
			System.out.println("a is greatest");
		}
		else if(b>c) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}
		
		

	}

}
