package com.java.basic50;

import java.util.HashMap;

public class CountCharacterOccurencesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav mahajan";
		int len = str.length();
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for(int i = 0; i < len ; i++)
		{
			char ch = str.charAt(i);
			if(ch == ' ')
				continue;
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch) + 1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		System.out.println(charMap);

	}

}
