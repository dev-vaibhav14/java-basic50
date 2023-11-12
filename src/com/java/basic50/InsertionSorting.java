package com.java.basic50;

import java.util.Arrays;

public class InsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr [] = {0,1,1,0,1,0,0,1,0,1};
		
		int len = arr.length;
		
		for(int i = 1; i < len - 1; i++)
		{
			int current = arr[i];
			int j = i -1;
			while(j> 0 && current < arr[j])
			{
				arr[j +1 ] = arr[j];
				j--;
			}
			arr[j +1] = current;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
