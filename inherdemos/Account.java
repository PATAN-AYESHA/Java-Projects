package com.lumen.inherdemos;

public class Account {

	double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	void withdraw(double amount) {
		this.balance = this.balance - amount;
		System.out.println("After withdraw: "+ this.balance);
	}
	
	void deposit(double amount) {
		this.balance = this.balance + amount;
		System.out.println("After deposit: "+ this.balance);
	}
	
	public double getBalance() {
		return balance;
	}
}
