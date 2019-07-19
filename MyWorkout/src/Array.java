
public class Array {

	public static void main(String[] args) {
		
		//One dimensional array--->disadv : 1.size is fixed  2.stores similar datatype
		//int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println(i.length);
		System.out.println("************");
		
	//print all values of array

		for (int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//double array
		double d[] = new double[2];
		d[0] = 12.22;
		d[1] = 43.11;
		System.out.println(d[1]);
		
		//char array
		//boolean array
		//string array
		String s[] = new String[4];
		s[0] = "hi";
		s[1] = "how";
		s[2] = "are";
		s[3] = "you";
		System.out.println(s.length);
		System.out.println(s[1]);
	
		
		
		
		

	}

}
