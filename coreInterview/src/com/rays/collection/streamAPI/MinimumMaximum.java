package com.rays.collection.streamAPI;

import java.util.Arrays;

public class MinimumMaximum {
	public static void main(String[] args) {
		
		int[] i = { 10, 12, 45, 25, 23 };

		Arrays.stream(i).max().ifPresent(System.out::print);
		System.out.println();
		Arrays.stream(i).min().ifPresent(e -> System.out.println("Minimum = " + e));
	}
}
