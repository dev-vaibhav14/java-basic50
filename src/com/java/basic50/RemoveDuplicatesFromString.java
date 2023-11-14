package com.java.basic50;

import java.util.HashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav";
		
		int len = str.length();
		
		HashSet<Character> charSet = new HashSet<>();
		
		String str2 = "";
		for(int i = 0; i < len ; i++)
		{
			
			if(charSet.add(str.charAt(i)))
				str2 += str.charAt(i);
		}
		
		System.out.println(str2);
		

	}

}
