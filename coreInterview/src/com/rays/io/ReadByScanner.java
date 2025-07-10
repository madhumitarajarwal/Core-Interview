
package com.rays.io;

import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {

	/**
	 * When you want to process line-by-line input with options for parsing data (like numbers, words).
        Scanner is useful if you're also doing some basic parsing or pattern matching.

	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\MADHUMITA\\IO\\scanner.txt");
        
		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {

			System.out.println(sc.nextLine());

		}

		file.close();
		sc.close();

	}

}