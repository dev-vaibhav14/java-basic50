package com.java.basic50;

import java.util.Arrays;

public class SortArrayInDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,6,23,98,24,35,78};
		
		int len = arr.length;
		
		for(int i = 0; i< len -1; i++)
		{
			for(int j = 0 ; j < len - 1; j++)
			{
				if(arr[j] < arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j +1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
