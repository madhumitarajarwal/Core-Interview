
package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadLineByLineText {

	/**
	 * Preferred for reading large text files line by line.
       More efficient and faster than Scanner for simple line-based reading.
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

	
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\MADHUMITA\\IO\\readLine.txt"));
		String str = br.readLine();

		while (str != null) {
			System.out.println(str);

			str = br.readLine();

		}
		
		br.close();

	}

}