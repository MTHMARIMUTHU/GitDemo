package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;



public class HashTable {

	public static void main(String[] args) {
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2,"Jerry");
		h1.put(3, "Vim");
		
		//create a clone or copy
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable)h1.clone();
		System.out.println("the values from h1 "+ h1) ;
		System.out.println("the values from h2 "+ h2) ;
		
		h1.clear();
		System.out.println("the values from h1 "+ h1) ;
		System.out.println("the values from h2 "+ h2) ;
		
		//contains value
		Hashtable st = new Hashtable();
		st.put("A", "Vidhu");
		st.put("B", "Marimuthu");
		st.put("B", "Marimuthu"); // it contains only unique values 
		//st.compute("0","Null"); // no null key or values
		
		if(st.containsValue("Vidhu")) {
			System.out.println("Value is found");
		}
		
		//print all the values or iterate----enumeration---elements()
		
		Enumeration e = st.elements();
		System.out.println("print values from st using enum");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all the values from hashtable using------entryset()
		
		System.out.println("print values from st using entryset");
		Set s = st.entrySet();
		System.out.println(s);
		
		
		
		Hashtable st1 = new Hashtable();
		st1.put("A", "Vidhu");
		st1.put("B", "Marimuthu");
		
		//equals
		if(st.equals(st1))
			System.out.println("Equal");
		
		//get value from key
		System.out.println(st1.get("A"));
		
		//get the hashcode of hashtable obj
		System.out.println("Hashcode value of st1 is " + st1.hashCode());
		
	
		
		
		
		
		

	}

}
