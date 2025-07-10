package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentExternalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		StudentExternalizable s = new StudentExternalizable(10, "abcccc");
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("C:\\Users\\MADHUMITA\\IO\\Internlization.txt"));
		out.writeObject(s);
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("C:\\Users\\MADHUMITA\\IO\\Internlization.txt"));
		s = (StudentExternalizable) in.readObject();

		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s);

		out.close();
		in.close();
	}
}