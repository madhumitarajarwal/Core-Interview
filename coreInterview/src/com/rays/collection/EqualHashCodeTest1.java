package com.rays.collection;

import java.util.*;

public class EqualHashCodeTest1 {

	public static void main(String[] args) {

		EqualHashCode e1 = new EqualHashCode(1, "abc", 500);
		EqualHashCode e2 = new EqualHashCode(1, "abc", 500);
		EqualHashCode e3 = new EqualHashCode(1, "abc", 500);
		EqualHashCode e4 = new EqualHashCode(1, "abc", 500);

		Set set = new HashSet();

		set.add(e1);
		set.add(e2);

		System.out.println(set);

		System.out.println("----------------using hashmap--------- ");
		Map m = new HashMap();

		m.put(e1, 100);
		m.put(e2, 200);
		
		System.out.println(m);
		
		System.out.println("-----using list---------");
		 
		List l=new ArrayList();
		 
		 l.add(e1);
		 l.add(e2);
		 l.add(e3);
		 l.add(e4);
		 
		 System.out.println(l);
		 l.remove(e1);
		 System.out.println(l);
		
		
		
	}
}