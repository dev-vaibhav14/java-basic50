package com.java.basic50;

public class FindAllPairsSumEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {2,3,6,4,8,9,1};
		
		int sum = 10;
		
		int len = arr.length;
		
		for(int i = 0; i< len ; i++)
		{
			for(int j = i +1 ; j < len ; j++)
			{
				if(arr[i]+ arr[j] == sum )
				{
					System.out.println(" sum of index " + i + " and " + j + " is equal to " + sum );
				}
			}
		}

	}

}
