package com.imrantechsoft.basicprograms;

public class SwappingNumbers {

	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Before Swapping values are: a=" +a+"  b="+b);

		//Logic 1 - using third variable
		int t = a;
		a=b;
		b=t; 

		//Logic 2 - using + and - without third variable
		a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20

		//Logic 3 - using * and / without using third variable
		a=a*b; // 10*20=200
		b=a/b; // 200/20=10
		a=a/b; // 200/10=20


		//Logic 4 - bitwise XOR (^)
		a=a^b; //10^20=30
		b=a^b; //30^20=10
		a=a^b; //30^10=20

		System.out.println("After Swapping values are: a=" +a+"  b="+b);
	}

}
