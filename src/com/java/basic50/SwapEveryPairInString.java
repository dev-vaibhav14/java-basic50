package com.java.basic50;

import java.util.Arrays;

public class SwapEveryPairInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav";
		
		int len = str.length();
		
		char[] arr = str.toCharArray();
		
		for(int i =0; i < len -1 ; )
		{
			System.out.println(i);
			int j = i+1;
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i = i+2;
		}
		
		System.out.println(new String(arr));

	}

}
