package com.lumen.scan;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
	
		String res= a>b && a>c? "a is Greater": b>c? "b is greater":"c is greater";
		System.out.println(res);
		scanner.close();
	}

}
