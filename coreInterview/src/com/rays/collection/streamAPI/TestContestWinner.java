package com.rays.collection.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestWinner {

	public static void main(String[] args) {

		List<ContestWinner> l = new ArrayList<ContestWinner>();
		l.add(new ContestWinner("okk", "8966012549"));
		l.add(new ContestWinner("okok", "65154488485"));
		l.add(new ContestWinner("okok", "65154488485"));
		l.add(new ContestWinner("okok", "65154488485"));

		l.stream().map(e -> (e.getName()+ " " +e.getPhoneNo())).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), c -> {
					Collections.shuffle(c);
					return c.stream();
				})).limit(2).forEach(c -> System.out.println(c));

	}

}