package com.imrantechsoft.basicprograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter a number: ");
		int num = sc.nextInt();
		long fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("The Factorial of " +num+ " is: " +fact);
		sc.close();
	}
}
