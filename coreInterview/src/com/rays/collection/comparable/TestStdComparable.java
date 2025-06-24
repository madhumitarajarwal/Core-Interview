package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStdComparable {

	public static void main(String[] args) {

		List list = new ArrayList();

		
		list.add(new Student(2, "c" ,1000));
		list.add(new Student(3, "c" ,500));
		list.add(new Student(1, "c" ,200));
		list.add(new Student(4, "c" ,10));

		Collections.sort(list);

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}