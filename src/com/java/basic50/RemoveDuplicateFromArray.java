package com.java.basic50;

import java.util.HashSet;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,2,4,5,1};
		
		HashSet<Integer> numSet = new HashSet<Integer>();
		
		int len = arr.length;
		
		for(int i =0; i< len; i++)
		{
			numSet.add(arr[i]);
		}
		
		System.out.println(numSet);

	}

}
