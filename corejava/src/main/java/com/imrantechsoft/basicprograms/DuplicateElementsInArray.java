package com.imrantechsoft.basicprograms;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String arr[] = {"Java","C","C++","Python","Java"};

		//Approach1
		boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1; j<arr.length;j++) {
				if(arr[i]==arr[j]) 
				{
					System.out.println("Found Duplicate Element: "+ arr[i]);
					flag=true;
				}
			}
			if(flag==false)
			{
				System.out.println("Duplicate Element not Found");
			}
		}  


		//Aproach2 - HashSet		
		HashSet<String> language = new HashSet<String>();
		boolean flaglang = false;
		for(String lang : arr) 
		{
			if(language.add(lang)==false)
			{
				System.out.println("Found Duplicate Element: "+ lang);
				flaglang = true;
			}
		}
		if(flaglang==false)
		{
			System.out.println("Duplicate Element not Found");
		}
	}
}