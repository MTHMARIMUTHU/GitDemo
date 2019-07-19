
public class variable {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=21474864;
		byte b=32;
		byte total=(byte)(a+3); /*casting*/
		short s=120;
		long l =(50000L+(b*10)+s+a);
		char c ='\u00A9'; /* Unicode expression */
		boolean myboolean= true;
		String mystring="Love Java & Learn Automation";
		String mystring2=" \u00A10 Consider Done";
		String mystring3="10";
		mystring = mystring + mystring2+ " Love You";
		System.out.println("long value: " +l);
		System.out.println("total value: " +total);
		System.out.println("Char value: " +c);
		System.out.println("myboolean value: " +myboolean);
		System.out.println("AIM: " +mystring);
		System.out.println("AIM: " +mystring2);
		mystring =  mystring2+ "Love You";
		mystring3=mystring3+a; /*join the value in string*/
		System.out.println("Final: " +mystring);	
		System.out.println("String always: " +mystring3);
				
	}

}
