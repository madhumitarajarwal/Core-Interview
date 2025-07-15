
package com.rays.thread;

public class Account {

	private int balance;

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public synchronized void deposite(String name, int amt) {
		// synchronized (this) {
		setBalance(getBalance() + amt);
		System.out.println(name + " " + getBalance());
		// }
	}

}