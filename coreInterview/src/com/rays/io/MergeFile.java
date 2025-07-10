package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C://Users//MADHUMITA//IO//merge1.txt");

		BufferedReader br = new BufferedReader(new FileReader("C://Users//MADHUMITA//IO//merge2.txt"));

		String s1 = br.readLine();

		while (s1 != null) {

			fw.write(s1);

			s1 = br.readLine();

		}
		br.close();

		br = new BufferedReader(new FileReader("C://Users//MADHUMITA//IO//merge3.txt"));

		String s2 = br.readLine();

		while (s2 != null) {

			fw.write(s2);

			s2 = br.readLine();

		}
		br.close();
		fw.close();

		System.out.println("success.......");

	}

}