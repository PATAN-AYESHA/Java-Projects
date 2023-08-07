package com.lumen.inherdemos;

public class CurrentAccount extends Account {

	public CurrentAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Withdrawing Amount: "+amount);
		this.balance = this.balance - amount;
		System.out.println("After Current Account withdraw: "+ this.balance);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Depositing Amount: "+amount);
		this.balance = this.balance+ amount;
		System.out.println("After Current Account deposit: "+ this.balance);
	}

	
}
