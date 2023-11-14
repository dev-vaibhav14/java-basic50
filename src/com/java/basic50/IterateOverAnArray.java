package com.java.basic50;

import java.util.Arrays;

public class IterateOverAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,5,6,2,3,1,9};
		int len = arr.length;
		for(int i = 0 ; i < len ; i++)
		{
			System.out.print(arr[i]);
		}
		
		for(int i : arr)
		{
			System.out.print(i);
		}
		
		Arrays.stream(arr).forEach( t -> System.out.print(t));
	}

}
