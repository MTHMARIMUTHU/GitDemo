package Hexaware;

import java.io.FileOutputStream;

public class FileOutput {


	public static void main(String[] args) {
		
		try {
			FileOutputStream fo = new FileOutputStream("D:\\test.txt");
			fo.write(65);
			fo.close();
			System.out.println("Success");
		}
	    catch(Exception e)
		{
			System.out.println(e);
			}
		
			
	}
	
}


