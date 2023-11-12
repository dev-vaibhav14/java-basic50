package com.java.basic50;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,4};
		
		int len = arr.length;
		
		int i = 0;
		int j = len -1 ;
		
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
