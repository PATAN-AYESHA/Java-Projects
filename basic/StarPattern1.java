package com.lumen.basic;

public class StarPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=5;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
