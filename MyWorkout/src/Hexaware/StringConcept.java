package Hexaware;

public class StringConcept {

	public static void main(String[] args) {
		
		//Replacing String
		
		String str = "Mary had a little lamb";
		System.out.println("Before Replacing");
		System.out.println(str);
		System.out.println("*******************");
		System.out.println("After replacing a with o");
		String str1 = str.replace("a", "o");
		System.out.println(str1);
		
		//To change case of a string
		
		System.out.println("*******************");
		System.out.println("Changing to upper case in string");
		System.out.println(str.toUpperCase());
		
		//Check length of a string
		System.out.println("********checking length of string**********");
		System.out.println(str.length());
		
		//reverse a string using StringBuffer
		System.out.println("********Reverse a string***********");
		StringBuffer s = new StringBuffer("Mary had a little lamb");
		System.out.println(s);
		System.out.println(s.reverse());
		
		//deleting part of string using StringBuilder
		System.out.println("********deleting using stringbuilder***********");
		StringBuilder s1 = new StringBuilder("Mary had a little lamb");
		System.out.println(s1);
		System.out.println(s1.delete(5,18));
		
	
		 
		}

}
