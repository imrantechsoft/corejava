package com.imrantechsoft.basicprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.next();


		// Using concatenation operator '+'
		/*
		String rev = "";
		int leng = input.length();
		for(int i = leng-1; i>=0; i--)
		{
			rev = rev + input.charAt(i);
		}     */


		// Using charArray
		/*  String rev = "";
		char a[] =  input.toCharArray();
		int leng = a.length;
		for(int i = leng -1; i>=0; i--)
		{
			rev = rev + a[i];
		}  */


		// Using StringBuffer
		StringBuffer sb = new StringBuffer(input);
		StringBuffer rev = sb.reverse();
		System.out.println("Reversed String is: " +rev);
		sc.close();
	}

}
