package com.rays.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapInterface {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		m.put(5, "e");
		m.put(1.1, "f");
         
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println(m.get(5));
		System.out.println(m.containsKey(4));
		System.out.println(m.containsValue("d"));
		System.out.println("+++++++++++++++++++++++++++++++++");

		TreeMap t = new TreeMap();

		t.put(1, "a");
		t.put(2, "b");
		t.put(3, "c");
		t.put(4, "d");
		t.put(5, "e");

		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.firstEntry());
		System.out.println(t.lastEntry());

		System.out.println("==============================================");

		LinkedHashMap l = new LinkedHashMap();
		l.put(1, "kgn");
		l.put(2, "jtn");
		l.put(3, "indore");
		t.put(2, "a");
		t.put(5, "b");

		System.out.println(l.get(2));
		System.out.println(l.containsKey(3));
		System.out.println(l.containsValue("indore"));
		System.out.println(l.entrySet());
		System.out.println(l.keySet());
		System.out.println(l.values());
	}

}