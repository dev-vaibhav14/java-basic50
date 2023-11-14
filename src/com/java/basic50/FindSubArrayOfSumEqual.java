package com.java.basic50;

import java.util.ArrayList;

public class FindSubArrayOfSumEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 5, 7, 19, 4, 9 , 6,6};

		int sum = 12;

		int len = arr.length;
		int newSum = 0;
		ArrayList<Integer> indexList = new ArrayList<Integer>();
 		for (int i = 0; i < len; i++) 
		{
			System.out.println("i is "  + arr[i]);
			 if(arr[i] > sum)
			 {
				 continue;
			 }
			 indexList.add(i);
			 newSum = arr[i];
			for (int j = i +1; j < len; j++)
			{
				if(newSum < sum)
				{
					System.out.println("Adding " + arr[j]);
					indexList.add(j);
					newSum = newSum + arr[j];
				}
				
				if(newSum == sum || newSum > sum)
				{
                    if(newSum == sum)
                    System.out.println("sum found in sub array of index" + indexList);
                    indexList.clear();
            
					break;
				}
				
			}
			if(newSum == sum || newSum > sum)
				continue;
		}

		System.out.println(newSum);
		
	}

}
