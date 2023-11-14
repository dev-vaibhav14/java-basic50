package com.java.basic50;

import java.util.Arrays;

public class MergeTwoUnSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {3,5,7};
		int arr2[] = {1,2,6};
		
		int len1 = arr1.length;
		
		int len2 = arr2.length;
		
		int arr3[] = new int[len1+len2];
		
		int i =0 , j=0, k =0;
		
		while( i < len1 && j < len2)
		{
			if(arr1[i] < arr2[j])
			{
				arr3[k] = arr1[i];
				i++;
				k++;
			}
			else
			{
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i < len1)
		{
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while(j < len2)
		{
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		
		System.out.println(Arrays.toString(arr3));
		

	}

}
