package com.java.basic50;

public class CountCharactersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibahv123";
		
		
		int len = str.length();
		
		int count = 0;
		for(int i = 0; i< len ; i++)
		{
			
			if(Character.isLetter(str.charAt(i)))
				count++;
		}
		
		System.out.println("Number of characters in the string are " + count);

	}

}
