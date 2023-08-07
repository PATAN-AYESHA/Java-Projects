package com.lumen.basic;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {3,6,1,8,4,9,5};
		int temp;
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(numbers[i]<numbers[j]) {
					temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
				}
			}
		}
		
		System.out.println("Second Smallest number in the given array is: "+ numbers[1]);
	}

}
