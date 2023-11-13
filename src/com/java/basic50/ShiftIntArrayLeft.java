package com.java.basic50;

import java.util.Arrays;

public class ShiftIntArrayLeft {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,4,5,6};
		
		int len = arr.length;
		int noOfTimes = 2;
		for (int k = 0; k < noOfTimes; k++) {
			int j = arr[0];
			for (int i = 0; i < len -1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[len - 1] = j;
		}
		System.out.println(Arrays.toString(arr));

	}

}
