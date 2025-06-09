package com.rays.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapInterface {
	
	public static void main(String[] args) {
		SortedMap s=new TreeMap();
		s.put(1, "one");
		s.put(2, "two");
		s.put(5, "three");
		s.put(5, "one");
		s.put(4, "one");
		
		System.out.println(s.lastKey());
		System.out.println(s.firstKey());
		System.out.println(s.tailMap(2));
		System.out.println(s.entrySet());
		System.out.println(s.subMap(2, 4));
	}

}