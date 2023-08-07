package com.lumen.absdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter default balance:");
		double balance = scanner.nextDouble();
		SavingsAccount account = new SavingsAccount(balance);
		CurrentAccount account1 = new CurrentAccount(balance);
		boolean flag=true;
		while(flag) {
			System.out.println("Welcome to ATM Banking");
			System.out.println("1.Saving Account\t\t2.Current Account\t\t3.Exit");
			System.out.println("Please enter your choice:");
			int choice = scanner.nextInt();
			switch(choice) {
				case 1:
				{
					System.out.println("1.Withdraw\n2.deposit\nf3.Check Balance\n4.Exit");
					System.out.println("Please enter your choice:");
					int choice2 = scanner.nextInt();
					if(choice2==1) {
						System.out.println("Enter amount:");
						double amount = scanner.nextDouble();
						account.withdraw(amount);
					}
					if(choice2==2) {
						System.out.println("Enter amount:");
						double amount = scanner.nextDouble();
						account.deposit(amount);
					}
					if(choice2==3) {
						System.out.println("Balance: "+account.getBalance());
					}
					if(choice2==4) {
						break;
					}
					break;
				}
				case 2:
				{
					System.out.println("1.Withdraw\n2.deposit\n3.Check Balance\n4.Exit");
					System.out.println("Please enter your choice:");
					int choice2 = scanner.nextInt();
					if(choice2==1) {
						System.out.println("Enter amount:");
						double amount = scanner.nextDouble();
						account1.withdraw(amount);
					}
					if(choice2==2) {
						System.out.println("Enter amount:");
						double amount = scanner.nextDouble();
						account1.deposit(amount);
					}
					if(choice2==3) {
						System.out.println("Balance: "+account1.getBalance()); 
					}
					if(choice2==4) {
						break;
					}
					break;
				}
				case 3:
				{
					flag=false;
					break;
					
				}
				default:{
					System.out.println("Sorry! something went wrong. Please try again");
				}
			
			}
		}
		scanner.close();

	}

}
