
package com.rays.collection.streamAPI;

import java.util.Arrays;
import java.util.List;

public class SteamStartWithT {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("madhu", "Madhu", "Megha", "alka","alka");

		list.stream().map(e -> e.toUpperCase()).filter(e -> e.startsWith("M")).distinct().sorted().forEach(System.out::println);
		
		
		
//		map(): Pehle sabhi elements ko uppercase mein convert karo.
//		filter(): Sirf un elements ko rako jo "K" se shuru hote hain.
//		distinct(): Duplicates ko hata do.
//		sorted(): Jo bache hue elements hain, unko alphabetically sort karo.
//		forEach(): Har sorted aur filtered element ko print karo.

	}

}
