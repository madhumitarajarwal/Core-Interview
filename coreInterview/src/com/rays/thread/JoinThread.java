 package com.rays.thread;

public class JoinThread extends Thread {

	String name = null;

	public JoinThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " = " + name);
		}
	}
	
	public static void main(String[] args) {

		JoinThread t1 = new JoinThread("abc");

		JoinThread t2 = new JoinThread("xyz");

		t1.start(); // Start t1 first

		

			try {
				t1.join();          // Wait for t1 to complete
			} catch (InterruptedException e) {
				e.printStackTrace();
			}                              
		
			t2.start(); // Start t2 after t1 completes
		
	}
}