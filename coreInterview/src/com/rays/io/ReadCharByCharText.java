
package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharText {

	/**
	 * Best when you want to analyze or manipulate characters individually, such as counting vowels, formatting content, or custom parsing.
         Simple and low-level; doesn’t read line-by-line.
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("C:\\Users\\MADHUMITA\\IO\\readchar.txt");

		int i = file.read();

		while (i != -1) {

			System.out.print((char) i);

			i = file.read();

		}

		file.close();

	}

}