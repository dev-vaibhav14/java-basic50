package com.java.basic50;

public class InsertStringIntoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "vai mahajan";
		
		String str2 = "bhav";
		
		int index = 3;
		
		
		/*
		 * String str3 = str1.substring(0, index); String str4 = str1.substring(index);
		 * 
		 * System.out.println(str4);
		 * 
		 * str1 = str3 + str2 + str4; System.out.println(str1);
		 */
		
		
		// without inbuilt function
		int len = str1.length();
		
		String newString = new String();
		
		for(int i = 0; i < len; i++)
		{
			if(i == index)
			{
				newString += str2;
			}
		    newString += str1.charAt(i);
		    
		}
		
		System.out.println(newString);

	}

}
