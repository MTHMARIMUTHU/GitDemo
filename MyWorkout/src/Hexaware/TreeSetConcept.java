package Hexaware;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {
		TreeSet <String> ts = new TreeSet <String> ();
		ts.add("Tom");
		ts.add("Ray");
		ts.add("Bobby");
		
		//traverse through iterator
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println(ts.descendingSet()); //descending order
		ts.add("Sim"); //add
		System.out.println(ts);
		System.out.println(ts.first()); //first element
		System.out.println(ts.last()); //last element
		


	}

}
