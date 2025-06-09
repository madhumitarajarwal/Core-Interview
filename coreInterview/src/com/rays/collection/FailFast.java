package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class FailFast {
	public static void main(String[] args) {
		List l = new ArrayList();
		// ArrayBlockingQueue l = new ArrayBlockingQueue(5); // Exception Not raise
		l.add(1);
		l.add(3);
		l.add(2);

		Iterator it = l.iterator();
		l.add(5);
//		l.add("abc");

//        l.add(4);    // Here we cannot add or remove elements when list object
//        l.clear();   // Here we clear

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}