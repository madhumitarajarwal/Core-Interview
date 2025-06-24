package com.rays.collection.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpIdTest {
	public static void main(String[] args) {

		List<Emp> l = new ArrayList();
		l.add(new Emp(1, "madhu"));
		l.add(new Emp(4, "megha"));
		l.add(new Emp(3, "suraj"));
		l.add(new Emp(2, "vinjal"));

		l.stream().sorted(Comparator.comparingInt(Emp::getId))
				.forEach(e -> System.out.println(e.getId() + " =" + e.getName()));

	}

}
