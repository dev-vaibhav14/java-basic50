package com.java.basic50;

public class FindRepeatingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,5,2,7,5};
		
		int len = arr.length;
		
		for(int i = 0; i< len ; i++)
		{
			for(int j = i +1; j < len ; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Duplicate found at index " + i + " and " + j);
				}
			}
		}

	}

}
