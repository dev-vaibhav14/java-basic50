package com.java.basic50;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "vaibhav";
		
		char[] charArray = str.toCharArray();
		
		char temp;
		
		int len = charArray.length;
		
		for(int i = 0; i < len -1 ; i++)
		{
			for(int j = 0; j< len -1 ; j++)
			{
				if(charArray[j] > charArray[j+1])
				{
					temp = charArray[j];
					charArray[j] = charArray[j+1];
					charArray[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(charArray));

	}

}
