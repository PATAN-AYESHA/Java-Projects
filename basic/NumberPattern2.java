package com.lumen.basic;

public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=5;
		int k=1;
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
