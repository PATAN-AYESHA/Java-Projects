package com.lumen.basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=121;
		int no_of_digits=0;
		int temp=number;
		int remainder;
		int amstrong=0;
		while(temp>0) {
			no_of_digits+=1;
			temp=temp/10;
		}
		temp=number;
		while(temp>0) {
			remainder=temp%10;
			amstrong+=Math.pow(remainder,no_of_digits);
			temp=temp/10;
		}
		if(number==amstrong) {
			System.out.println(number+" is an Amstrong number");
		}
		else {
			System.out.println(number+" is not an Amstrong number");
		}
	}

}
