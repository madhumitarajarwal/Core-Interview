package com.rays.oop.abstractInterface;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void Deposite(int amt) {

		System.out.println("Total balance" + balance);
		System.out.println("Deposite Amt" + amt);
		balance = balance + amt;
		System.out.println("After Deposite Amt" + balance);
	}

	public void Withdrawal(int amt) {
        System.out.println(amt);
		if ((balance - 2000) < amt) 
		{
			System.out.println("low balance");
		} else {

			System.out.println("Total balance" + balance);
			System.out.println("Withdrawl Amt" + amt);
			balance = balance - amt;
			System.out.println("After Withdrawl Amt" + balance);
		}
	}

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setBalance(2000);
		ac.Deposite(500);
		ac.Withdrawal(100);
	}

}