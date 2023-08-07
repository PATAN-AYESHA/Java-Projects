package com.lumen.basic;

public class DuplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int elements[]= {4,2,7,2,6,4,8,1,7};
		int count=0;
		for(int i = 0; i < elements.length; i++) 
		{
			for(int j = i + 1; j < elements.length; j++)
			{
				if(elements[i] == elements[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("\nCount of Duplicate elements in the array  = " + count);
		
	}

}
