package com.java.basic50;

import java.util.Arrays;

public class SeperateZeroesAndNonZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,1,0,3,0,0,4,0};
		
		 int len = arr.length;
		 
		 int start = 0;
		 
		 int end = len - 1;
		 
		 for(int i = 0; i< len ; i++)
		 {
			 if(arr[i] != 0)
			 {
				 for(int j = i +1; j < len ;j++)
				 {
					 if(arr[j] == 0)
					 {
						 int temp = arr[j];
						 arr[j] = arr[i];
						 arr[i] = temp;
					 }
				 }
			 }
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 
		 
		 
		 
		 
		 

	}

}
