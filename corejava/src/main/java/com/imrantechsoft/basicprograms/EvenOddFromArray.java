package com.imrantechsoft.basicprograms;

public class EvenOddFromArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6};

		// extracting even numbers from array
		System.out.println("Even Numbers in Array ");
		for(int i=0; i<a.length;i++) 
		{
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		// extracting odd numbers from array
		System.out.println("Odd Numbers in Array ");
		for(int i=0; i<a.length;i++) 
		{
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}
}