package com.java.basic50;

import java.util.Stack;

public class PalindromeStringUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "racecar";
		
		Stack<Character>  stack = new Stack<Character>();
		
		int len = str.length();
		
		for(int i =0 ; i < len ; i++)
		{
			stack.push(str.charAt(i));
		}
		
		System.out.println(stack);
		
		String reversedString = "";
		
		
		for(Character ch : stack)
		{
			reversedString = reversedString + ch;
		}

		System.out.println(reversedString);
		
		if(str.equals(reversedString))
			System.out.println("String is palindrome");
		  
		
	}

}
