package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExitFileWriteLineByLine {

	public static void main(String[] args) throws IOException  {

		FileWriter file = new FileWriter("C:\\Users\\MADHUMITA\\IO\\reading.txt", true);

		PrintWriter out = new PrintWriter(file);

		out.println("hello developer");

		out.println("happy coding..!!");
 
		out.close();

		
		file.close();

		System.out.println("data write successfully...!!!");

	}

}