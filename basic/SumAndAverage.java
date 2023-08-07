package com.lumen.basic;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {3,6,1,8,4,9,5};
		int sum=0;
		float avg;
		for(int number:numbers) {
			sum+=number;
		}
		avg=sum/numbers.length;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
	}

}
