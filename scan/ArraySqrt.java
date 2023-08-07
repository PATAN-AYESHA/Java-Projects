package com.lumen.scan;

import java.util.Scanner;

public class ArraySqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int numbers[]= new int[5];
		double sqrtnumbers[] = new double[5];
		System.out.println("Enter five numbers: ");
		for(int i=0;i<5;i++) {
			numbers[i]=scanner.nextInt();
			sqrtnumbers[i]=Math.sqrt(numbers[i]);
		}
		for(int i=0;i<5;i++) {
			System.out.print(sqrtnumbers[i]+"\t");
		}
		
		scanner.close();
	}

}
