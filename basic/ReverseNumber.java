package com.lumen.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=234;
		int reversenumber=0;
		int remainder;
		while(number>0) {
			remainder=number%10;
			reversenumber= (reversenumber*10)+remainder;
			number=number/10;
		}
		
		System.out.println("Reverse of the given number is: "+reversenumber);
	}

}
