package com.rays.collection.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpNameTest {
	
	public static void main(String[] args) {
		
		List<Emp> l = new ArrayList();
		
		l.add(new Emp(1, "madhu"));
		l.add(new Emp(4, "priya"));
		l.add(new Emp(2, "alka"));
		l.add(new Emp(8, "bulbul"));

		l.stream().sorted(Comparator.comparing(Emp::getName)).forEach(e -> System.out.println(e.getId() + " = " + e.getName()));
		

	}

}