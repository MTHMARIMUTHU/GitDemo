package OOPSConcept;

public class StaticAndNonStatic {
	
	String name = "Tom";
	static int age = 25;

	public static void main(String[] args) {
		
		//to call a static method--->1.direct calling  or by class name
		sum();
		
		//2.calling by class name
		StaticAndNonStatic.sum();
		
		

	}
	
	public void sendMail() {
		System.out.println("send mail method");
	}
	
	public static void sum() {
		System.out.println("Sum method");
	}

}
