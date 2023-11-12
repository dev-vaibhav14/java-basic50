package com.java.basic50;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "vaibhav";
		
		String reversedString = reverseString(str);
		
		System.out.println(reversedString);
		
		if(str.equals(reversedString))
		{
			System.out.println(" String is Palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

	private static String reverseString(String str) 
	{
		// TODO Auto-generated method stub
		
		int len = str.length();
		 String rString = "";
 		for(int i = len  - 1; i >= 0; i-- )
		{
			rString = rString + str.charAt(i);
		}
		
		return rString;
	}

}
