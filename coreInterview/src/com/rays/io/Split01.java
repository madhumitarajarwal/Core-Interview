package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Split01 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\MADHUMITA\\IO\\split.txt"));
		int nol = 2;
		int countLine = 0;
		String s = br.readLine();
		while (s != null) {
			countLine++;
			System.out.println(countLine);
			s = br.readLine();
		}
		 br.close();
		int temp = countLine / 2;  // 5 / 2 = 2
		System.out.println("countline value"+countLine);
		System.out.println("temp"+temp);
		if (countLine % 2 != 0) { // 5 % 2 = 1 (not 0)
			temp++;  // 2 + 1 = 3
		}
		br = new BufferedReader(new FileReader("C:\\Users\\MADHUMITA\\IO\\split.txt"));
		String str;
		for (int i = 1; i <= temp; i++) {
			PrintWriter pw = new PrintWriter(
					new FileWriter("C:\\Users\\MADHUMITA\\IO\\split" + i + ".txt"));
			for (int j = 1; j <= nol; j++) {
				str = br.readLine();
				if (str == null) {
					break;
				}
				pw.println(str);
			}
			pw.close();
		}
	}
}