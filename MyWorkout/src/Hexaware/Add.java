package Hexaware;

public class Add {
	
	int x = 10;
	int y = 20;
	
	public void add()
	{
		int result;
		result = x+y;
		System.out.println("Addition is :" + result);
	}

	public static void main(String[] args) {
		
		Add obj = new Add();
		obj.add();
		

	}

}
