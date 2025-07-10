package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentSerializable {

	public static void main(String[] args) throws  IOException, ClassNotFoundException {

		StudentSerializable s = new StudentSerializable(290, "abc");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\MADHUMITA\\IO\\student.txt"));

		out.writeObject(s);

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\MADHUMITA\\IO\\student.txt"));

		s = (StudentSerializable) in.readObject();
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s);
		
		out.close();
		in.close();
	}
}