package com.lumen.basic;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0;
		int number2=1;
		int limit=9;
		int sum=0;
		System.out.println("Fibonacci Series:");
		for(int i=1;i<=limit;i++) {
			sum=number1+number2;
			number1=number2;
			number2=sum;
			System.out.println(sum);
		}

	}

}
