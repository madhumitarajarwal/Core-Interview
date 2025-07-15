package com.rays.thread;

public class WithoutThread {

	String name = null;

	public WithoutThread(String name) {
		this.name = name;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(i + " " + name);

		}

	}
	
	public static void main(String[] args) {

		WithoutThread t1 = new WithoutThread("abc");

		WithoutThread t2 = new WithoutThread("xyz");

		t1.run();
		t2.run();

	}

}