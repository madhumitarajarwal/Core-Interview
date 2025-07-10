package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {
		String source = "C://Users//Madhumita//IO//flower.jpg";
		String target = "C://Users//Madhumita//IO//emoji.jpg";
       
		
		//for read data
		FileInputStream in = new FileInputStream(source);
		
		//for write data
		FileOutputStream out = new FileOutputStream(target);

		int i;
		while ((i = in.read()) != -1) {

			out.write(i);

		}

		System.out.println("success");
	}

}