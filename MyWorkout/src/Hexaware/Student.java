package Hexaware;

import java.io.*;

public class Student implements Serializable {
	
	String name;
	int rno;
	static String contact;
	
	Student(String name,int rno,String c){
		this.name = name;
		this.rno = rno;
		this.contact = c;
		}
	
	
	
	public static void main(String[] args) {
		
		try{
			Student s = new Student("Tom",12,"London");
		
		FileOutputStream fo = new FileOutputStream("student.ser");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(s);
		oo.close();
		fo.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		

	}

}
