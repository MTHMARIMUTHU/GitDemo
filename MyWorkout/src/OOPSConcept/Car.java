package OOPSConcept;

public class Car {
	
	//class var
	int model;   //global var
	int wheel;   
	
	public static void main(String[] args) {
		
		Car a = new Car(); //c,d,e---> obj reference variable
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2016;
		b.wheel = 4;
		b.model = 2017;
		c.wheel = 4;
		
		System.out.println("The car model is :" + a.model);
		System.out.println("No. of wheels a car has :" + c.wheel);
		
		a=b;
		b=c;
		c=a;
		
		a.model = 10;
		System.out.println(a.model);
		c.model = 20;
		System.out.println(c.model);
		
		

	}

}
