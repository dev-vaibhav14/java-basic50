package com.java.basic50;

public class FindPairWhoseSumClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12,3,4,6,5,7};
		
		int len = arr.length;
		
		int minSum = arr[0] + arr[1];
		int index1 = 0;
		int index2 = 0;
		for(int i = 0; i< len ; i++)
		{
			for(int j = i+1; j< len ;j++)
			{
				int sum = arr[i] + arr[j];
				if(sum < minSum)
				{					
					minSum = sum;
					index1 = i;
					index2 = j;
				}
			}
		}
		
		System.out.println(index1 + " " + index2);

	}

}
