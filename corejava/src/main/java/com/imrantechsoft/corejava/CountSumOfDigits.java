package com.imrantechsoft.corejava;

import java.util.Scanner;

public class CountSumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num = sc.nextInt();
		int sum  = 0;
		while(num>0) {
			sum = sum+num%10;
			num = num/10;
		}
		System.out.println("Sum of Digits in a number:" +sum);
		sc.close();
	}
}
