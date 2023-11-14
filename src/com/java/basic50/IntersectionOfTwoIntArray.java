package com.java.basic50;

import java.util.ArrayList;

public class IntersectionOfTwoIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1,2,3};
		int arr2[] = {2,3,4};
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		ArrayList<Integer> commonElements = new ArrayList<>();
		
		if(len1 == len2)
		{
			for(int i =0 ; i < len1 ; i++)
			{
				for(int j = 0;j< len1 ; j++)
				{
					if(arr1[i] == arr2[j])
						commonElements.add(arr1[i]);
						
				}
			}
			System.out.println(" Intersection of two arrays " +  commonElements);
		}

	}

}
