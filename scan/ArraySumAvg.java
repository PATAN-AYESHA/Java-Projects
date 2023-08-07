package com.lumen.scan;

import java.util.Scanner;

public class ArraySumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int numbers[]= new int[5];
		int sum=0;
		double average;
		System.out.println("Enter the values in to an array: ");
		for(int i=0;i<5;i++) {
			numbers[i]= scanner.nextInt();
			sum+=numbers[i];
		}
		System.out.println("Sum: "+sum);
		average=sum/numbers.length;
		System.out.println("Average: "+average);
		
		scanner.close();
		

	}

}
