package com.imrantechsoft.basicprograms;

public class MissingNumberInArray {

	public static void main(String[] args) {

		// Array should not have duplicates
		// Array need not be in sorted order
		// Values should be in range

		int a[] = {1,2,3,4,6,7,8,9,10}; 
		// 1+2+3+4+6+7+8+9+10=50=sum1
		// 1+2+3+4+5+6+7+8+9+10=55=sum2

		int sum1=0;
		for(int i=0; i<a.length;i++) 
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of Elements in an Array: " +sum1);

		int sum2 = 0;
		for(int i=1; i<=10;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of Range of elements in Array: "+sum2);
		System.out.println("Missing number is: " +(sum2-sum1));
	}
}
