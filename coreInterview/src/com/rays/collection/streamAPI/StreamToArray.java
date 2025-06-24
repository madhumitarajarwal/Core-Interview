package com.rays.collection.streamAPI;

import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("c", "b", "a");

		String[] stringArray = stream.toArray(e -> new String[e]);
		
        System.out.println(stringArray[1]);
	}

}
