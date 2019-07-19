package Hexaware;

import java.io.*;
import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.next();
		System.out.println("Enter your age");
		int age = s.nextInt();
		
		System.out.println("Your name is :"+name);
		System.out.println("Age is :"+age);
		s.close();

	}

}
