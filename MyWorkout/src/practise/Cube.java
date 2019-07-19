package practise;

public class Cube {
	
	String name;
	int age;
	
	
	
	
	//constructor1
		public Cube() {
		System.out.println("Constructor with no parameter");
		name = "noname";
		age = 4;
		}
		
	//constructor 2
		public Cube(String iname) {
		System.out.println("Constructor with parameters");
		name = iname;
		age = 10;
			
	}
	//constructor 3
		public Cube(int iage) {
		age = iage;
		name = "vidhya";
		age = 20;
		}
			
	//constructor 4
		public Cube(String name,int age) {
		this.name = name;
		this.age = age;
				
	}
		
		
	//method
		public void introduce() {
		System.out.println("name is "+name);
		System.out.println("age is"+ age);
	}

}
