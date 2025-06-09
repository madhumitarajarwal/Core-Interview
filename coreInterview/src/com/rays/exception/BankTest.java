package com.rays.exception;

public class BankTest {

	public static void main(String[] args) {

		BankAccount a = new BankAccount();
		
		a.setBalance(5000);
		a.deposite(100);
		System.out.println(a.getBalance());
		
		try {
			a.withdraw(4000);
			System.out.println(a.getBalance());
		} catch (BankException e) {
			System.out.println("Amount is less than 2000");
		}
		a.deposite(7000);
		System.out.println(a.getBalance());
	}
}