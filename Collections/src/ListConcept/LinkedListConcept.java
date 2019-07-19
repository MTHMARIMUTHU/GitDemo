package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Tom");//add
		ll.add("Terry");
		ll.add("Trump");
		
		System.out.println(ll.size());//size
		System.out.println(ll);//print
		
		ll.addFirst("Tommy");
		ll.addLast("Mary");
		System.out.println(ll);
		
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0,"Hi");
		System.out.println(ll.get(0));
		//remove
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		//print all the values in linked list
		//1.for loop
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		//2.advanced for loop
		
		for(String str : ll) {
			System.out.println(str);
		}
		
		//3.while loop
		
		int i = 0;
		while(i>ll.size()) {
			System.out.println(ll.get(i));
			i++;
		}
		
		//4.iterator
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
