package com.java.basic50;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeStringUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "racecar";
		
		String reversedString = "";
		
		Queue<Character> queue = new LinkedList<>();
		
		for(int i = str.length() - 1; i >= 0 ; i--)
		{
			queue.add(str.charAt(i));
		}
		
		System.out.println(queue);
	
		
		for (Character ch : queue)
		{
			reversedString = reversedString + ch;
		}
		
		System.out.println(reversedString);
		
		if(str.equals(reversedString))
			System.out.println("String is palindrome");

	}

}
