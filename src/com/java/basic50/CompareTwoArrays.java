package com.java.basic50;

public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1,2,3};
		int arr2[] = {1,2,2,4};
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		boolean isEqual = true;
		if(len1 != len2)
		{
			System.out.println("Two arrays are not equal");
			isEqual = false;
		}
		else
		{
		  for(int i = 0,  j = 0; i < len1; i++)
		  {
			  if(arr1[i] != arr2[i])
			  {
				  System.out.println("Two arrays not equal");
				  isEqual = false;
				  break;
				  
			  }
		  }
		}
		
		if(isEqual)
			System.out.println("Two arrays are equal");
	}

}
