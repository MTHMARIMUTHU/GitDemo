package Hexaware;

import java.util.ArrayList;

import java.util.*;



public class ListConcept {

	public static void main(String[] args) {
		TreeSet <String> ll = new TreeSet <String> ();
		ll.add("Tom");
		ll.add("Ray");
		ll.add("Bobby");
		
		//traverse through iterator
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//add at 3rd position
		ll.add( "Rani");
		System.out.println(ll);
		System.out.println("Size of the list :" + ll.size());
		//System.out.println(ll.get(2));
		//System.out.println(ll.set(2,"BobbySim"));
		System.out.println(ll.remove(3));
		ll.contains("Ray");
		
		//descending order
		TreeSet <String> ts = new TreeSet <String> ();
		ts.descendingSet();
		
		
		ArrayList <String> ll1 = new ArrayList <String>();
		ArrayList ll2 = (ArrayList) ll.clone();
		ll2.size();
		
		
	}

}
