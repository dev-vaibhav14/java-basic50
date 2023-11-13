package com.java.basic50;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "rat";
		String str2 = "tar";
		
		int str1Len = str1.length();
		int str2Len = str2.length();
		
		if(str1Len != str2Len)
		{
			System.out.println("Strings are not anagrams");
		}
		else
		{
			char[] char1Array = str1.toCharArray();
			char[] char2Array = str2.toCharArray();
			
			Arrays.sort(char1Array);
			Arrays.sort(char2Array);
			
			if(Arrays.equals(char1Array, char2Array))
			{				
				System.out.println("Strings are Anagrams");
			}
			else
			{
				System.out.println("Strings are not anagrams");
			}
		}
		
		

	}

}
