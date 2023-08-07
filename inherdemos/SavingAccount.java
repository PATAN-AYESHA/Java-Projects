package com.lumen.inherdemos;

public class SavingAccount  extends Account {

	public SavingAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	void withdraw(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Withdrawing Amount: "+amount);
		this.balance = this.balance - amount;
		System.out.println("After Saving Account withdraw:"+ this.balance );
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Depositing Amount: "+amount);
		this.balance = this.balance + amount;
		System.out.println("After Saving Account deposit:"+ this.balance);
	}

}
