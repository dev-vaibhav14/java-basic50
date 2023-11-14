package com.java.basic50;

import java.util.Iterator;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav";
		
		char[] charArray = str.toCharArray();
		
		int count = 0;
		
		for(int i : charArray)
		{
			count++;
		}
		
		
		System.out.println(count);
		
		

	}

}
