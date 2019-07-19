package OOPSConcept;

public class Functions {

	public static void main(String[] args) {
		
		Functions obj = new Functions();
		obj.test();
		
		int l = obj.sum();
		System.out.println(l);
		
		int m = obj.div(30, 10);
		System.out.println(m);
	}	
	//non static method
		
		public void test() { //return type is void
			System.out.println("test method");
		}
		
		public int sum() {//return type is int
			System.out.println("Sum method");
			int a = 10;
			int b = 20;
			int c = a+b;
			
			return c; 
		}
		
		public String Run() {
			System.out.println("Run method");
			String s = "Sports";
			
			return s;
			
			
		}
		
		public int div(int x, int y) {
			System.out.println("div method");
			int d = x/y;
			 return d;
		}
		
		
		
		
		
		

	}


