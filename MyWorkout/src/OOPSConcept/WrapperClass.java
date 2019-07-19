package OOPSConcept;

public class WrapperClass {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		//data conversion string to int------------------>parse
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//string to double
		 String y = "12.33";
		 double z = Double.parseDouble(y);
		 System.out.println(z);
		 
		 //int to string--------------------------------->valueOf
		 int j = 100;
		 String s = String.valueOf(j);
		 System.out.println(s);
		 
		 
		
		
		
		
		

	}

}
