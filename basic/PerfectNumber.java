package com.lumen.basic;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=6;
		int sum=0;
		int i=1;
		while(i<=(number/2)) {
			if(number%i==0) {
				sum+=i;
			}
			i++;
		}
		if(sum==number) {
			System.out.println(number + " is Perfect Number");
		}
		else {
			System.out.println(number+" is not a Perfect Number");
		}
	}

}
