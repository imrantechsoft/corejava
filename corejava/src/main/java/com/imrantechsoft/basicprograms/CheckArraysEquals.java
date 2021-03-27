package com.imrantechsoft.basicprograms;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6};
		int b[] = {1,2,3,4,5,6};

		boolean status = Arrays.equals(a, b);
		if(status)
			System.out.println("Arrays are Equals");
		else
			System.out.println("Arrays are not Equals");
	}
}
