package com.lumen.scan;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a<b && a<c) {
			System.out.println("a is smallest");
		}
		else if(b<c) {
			System.out.println("b is smallest");
		}
		else {
			System.out.println("c is smallest");
		}
		
		scanner.close();
	}

}
