package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[] = new int[3];//static array
		
		//It can contain duplicate value
		//Maintains insertion order on the basis of ordering
		//Not synchronised
		//Random access of index value
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(50);
		ar.add("Tom");
		ar.add('c');
		ar.add(12.33);
		
		System.out.println(ar.size()); //size of array
		System.out.println(ar.get(2)); //get value from index
		
		//to print all the values of array : for loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		//Generic Vs Non generic
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		ar2.add("Test");
		
		//Employee class object
		
		Employee e1 = new Employee("Tom",25,"CSE");
		Employee e2 = new Employee("Ram",26,"ECE");
		Employee e3 = new Employee("Tony",28,"IT");
		
		//Create ArrayList
		
		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		//Iterator to traverse the values
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		//addAll
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Tom");
		ar4.add("Teenu");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Sri");
		ar5.add("tanny");
		
		ar5.addAll(ar4);
		
		System.out.println(ar4.size());
		
		
		
		
		
		
		
		
		
		
		

	}

}
