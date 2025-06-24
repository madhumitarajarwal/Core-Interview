package com.rays.collection;

import java.util.HashMap;

public class MapIterator {

	public static void main(String[] args) {
		HashMap m = new HashMap();

		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(40000, "fourh");
		m.put(4, null);
		m.put(4, "abnull");
		
		 System.out.println("entry==>");
		for (Object o : m.entrySet()) {
            
			System.out.println(o);

		}
		// System.out.println(m);
		 System.out.println("value==>");
		for (Object o : m.values()) {
			 
			System.out.println(o);

			 //System.out.println(m);
		}
		  System.out.println("key==>");
		for (Object o : m.keySet()) {
			
			System.out.println(o);
		}

	}

}