package com.imrantechsoft.basicprograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();

		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();

		System.out.println("Enter Third Number: ");
		int c = sc.nextInt();

		// Approach1 - Algorithmic
		if(a>b && a>c) {
			System.out.println("\n"+a+ " is largest number");
		}
		else if(b>a && b>c) {
			System.out.println("\n"+b+ " is largest number");
		}
		else if(c>a && c>b) {
			System.out.println("\n"+c+ " is largest number");
		}


		// Using Ternary operator
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("\n"+largest+" is the largest number");
		sc.close();
	}
}
