package Hexaware;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("a",100);
		hm.put("b",200);
		hm.put("c",300);
		hm.put("d",400);
		
		Set < Map.Entry<String,Integer> > st = hm.entrySet();
		
		for( Map.Entry<String,Integer>  me:st) {
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		
		System.out.println(hm.putIfAbsent("e", 500));
		
		
		
		System.out.println(hm.containsValue(100)); //chk if value has 100
		System.out.println(hm.containsKey("b")); //chk if contains b
		System.out.println(hm.size()); //size of hashMap
		
		System.out.println(hm.keySet()); //get keys
		
		
		
		
		
		

	}

}
