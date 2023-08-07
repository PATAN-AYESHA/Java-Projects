package com.lumen.basic;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {4,5,2,8,7,9};
		int greatest=0;
		for(int number: numbers) {
			if(number > greatest) {
				greatest=number;
			}
		}
		System.out.println("Greatest number in the given array is: "+ greatest);
	}

}
