
package com.rays.thread;

public class TestThread extends Thread {

	private String name;

	public TestThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + name);

		}
	}

	public static void main(String[] args) {

		TestThread t1 = new TestThread("abc");
		TestThread t2 = new TestThread("xyz");

		t1.start();
		t2.start();

	}

}