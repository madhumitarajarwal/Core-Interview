package com.rays.exception;

public class BankAccount {

	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amt) {
		balance = balance + amt;
	}

	public double withdraw(double amt) throws BankException {
		if (balance - amt < 2000) {
			BankException e = new BankException("Amount is less than 2000.....");
			throw e;
		}
		balance = balance - amt;
		return balance;
	}
}