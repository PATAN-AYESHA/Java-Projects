package com.lumen.basic;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		int result = 1;
		for(int i=1;i<=number;i++) {
			result*=i;
		}
		System.out.println("Factorial of "+number+" is: "+result);
	}

}
