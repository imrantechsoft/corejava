package com.imrantechsoft.corejava;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		String orgStr = str;
		String rev = "";

		int leng = str.length();
		for(int i=leng-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		if(orgStr.equalsIgnoreCase(rev)) {
			System.out.println(orgStr + " is a Palindrome String");
		}
		else {
			System.out.println(orgStr + " is not a Palindrome String");
		}
		sc.close();
	}
}