package com.lumen.basic;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {4,5,2,8,7,9};
		int smallest = numbers[0];
		for(int number: numbers) {
			if(number < smallest) {
				smallest= number;
			}
		}
		System.out.println("Smallest number in the given array is: "+ smallest);
	}

}
