package Hexaware;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class LogAppln {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\log.txt");
		System.out.println("Enter your name");
		
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.println("Hi"+name);
		fw.write(name);
		fw.close();
		s.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}