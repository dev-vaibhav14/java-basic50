package com.java.basic50;

public class CountVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav";
		
		int len = str.length();
		
		str = str.toLowerCase();
		
		int count  = 0;
		for(int i = 0; i < len ; i++)
		{
			char ch = str.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		
		System.out.println("Number of vowels present are " + count);

	}

}
