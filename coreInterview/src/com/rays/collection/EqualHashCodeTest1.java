package com.rays.collection;

import java.util.*;

public class EqualHashCodeTest1 {
	public static void main(String[] args) {
		EqualHashCode e = new EqualHashCode(100, "kapil", 500);
		EqualHashCode e1 = new EqualHashCode(100, "kapil", 500);
		EqualHashCode e2 = new EqualHashCode(2, "kapil", 100);

		List l = new ArrayList();
		l.add(e1);
		System.out.println(l);

		l.remove(e1);
		System.out.println(l);

		System.out.println("setttttttttt");
		Set s = new HashSet();
		s.add(e);
		System.out.println(s);

		s.add(e);
		System.out.println(s);

		s.add(e2);
		System.out.println(s);

		System.out.println("mapppppppp");
		Map m = new HashMap();

		m.put(1, e);
		m.put(2, e1);
		System.out.println(m + "hhhh");

		m.remove(1, e2);
		System.out.println(m);
	}
}