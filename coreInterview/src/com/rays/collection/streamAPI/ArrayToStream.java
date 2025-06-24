package com.rays.collection.streamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {
		String[] str = { "okk", "c", "x", "v" };
		Stream<String> stream = Arrays.stream(str);
		stream.sorted().distinct().forEach(System.out::println);
	}
}