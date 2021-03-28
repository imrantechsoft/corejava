package com.imrantechsoft.basicprograms;

import java.util.Scanner;

public class LinearSearchArray {

	public static void main(String[] args) {

		int a[] = {10,20,30,40,50,60,70,80,90,100};

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number to search: ");
		int searchElement = sc.nextInt();
		boolean flag = false;

		for (int i = 0; i<a.length;i++)
		{
			if(searchElement == a[i])
			{
				System.out.println("Element found at: " + i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
		sc.close();
	}
}