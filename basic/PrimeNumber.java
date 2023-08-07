package com.lumen.basic;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=31;
		int count=0;
		int i=1;
		while(i<number/2) {
			if(number%i==0) {
				count+=1;
			}
			i++;
		}
		if(count==1) {
			System.out.println(number+" is a prime number");
		}
		else {
			System.out.println(number+" is not a prime number");
		}

	}

}
