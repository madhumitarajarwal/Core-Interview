
package com.rays.thread;

public class Racing extends Thread {

	String name;

	public static Account account = new Account();

	public Racing(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			account.deposite(name, 1000);
		}
	}
	public static void main(String[] args) {

		Racing t1 = new Racing("megha");

		Racing t2 = new Racing("vinjal");

		t1.start();
		t2.start();
	}
}