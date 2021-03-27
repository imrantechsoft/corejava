package com.imrantechsoft.basicprograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {

		// Approach1 - Random
		Random rand = new Random();
		int randInt = rand.nextInt(100);
		System.out.println("The random number is : "+randInt);

		//Appraoch2 - Math
		Double randDb = Math.random();
		System.out.println("The random double number is :"+randDb);

		//Approach3 - Apache commons-lang API
		String randNum = RandomStringUtils.randomNumeric(10);
		System.out.println("The random number is: "+randNum);

		String randAlph = RandomStringUtils.randomAlphabetic(10);
		System.out.println("The random number is: "+randAlph);
	}
}