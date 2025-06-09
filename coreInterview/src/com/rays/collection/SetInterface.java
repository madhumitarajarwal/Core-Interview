package com.rays.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(400);

		System.out.println(h.contains(100));
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.remove(100));

		System.out.println(h);

		System.out.println("====================================");

		TreeSet t = new TreeSet();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);

		System.out.println(t.contains(10));
		System.out.println(t.ceiling(10));
		System.out.println(t.first());
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.out.println(t.size());
		System.out.println(t.pollLast());
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

		LinkedHashSet l = new LinkedHashSet();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(4);

		System.out.println(l.contains(2));
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l.remove(4));
		System.out.println(l);
		System.out.println(l.hashCode());
		System.out.println(l.toArray());  
	}
}