package com.java.basic50;

public class RemoveLeadingZeroesFromString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "0000012345";
		
		int len = str.length();
		
		int i = 0, count = 0;
		
		for(i = 0 ; i < len ; i++)
		{
			if(str.charAt(i) == '0')
				count++;
		}
		
		System.out.println(str.substring(count));
	}

}
