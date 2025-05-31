package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;



public class NoSuchElementExcept {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("mango");
		list.add("banana");
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		try {
			System.out.println(iterator.next());
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
	}

}
