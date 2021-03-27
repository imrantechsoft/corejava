package com.imrantechsoft.corejava;

import java.util.Scanner;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number: ");
		int num = sc.nextInt();

		int evenCount = 0;
		int oddCount = 0;
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num = num/10;
		}
		System.out.println("Number of Even numbers are : "+evenCount);
		System.out.println("Number of Odd numbers are : "+oddCount);
		sc.close();
	}

}
