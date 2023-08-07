package com.lumen.basic;

public class ReverseNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {45,755,24,567,257,96,4,67};
		int remainder;
		for(int number:array) {
			int reversenumber=0;
			while(number>0) {
				remainder=number%10;
				reversenumber= (reversenumber*10)+remainder;
				number=number/10;
			}
			System.out.print(reversenumber+" ");
		}

	}

}
