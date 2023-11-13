package com.java.basic50;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FindNumbersOccuringOddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		int arr[] = {2,3,4,2,6,4,7};
		
		HashMap<Integer, Integer> numMap = new HashMap<>();
		
		int len = arr.length;
		
		for(int i = 0; i < len ; i++ )
		{
			if(numMap.containsKey(arr[i]))
			{
				numMap.put(arr[i], numMap.get(arr[i])+ 1);
			}
			else
			{
				numMap.put(arr[i],1);
				
			}
		}
		
		System.out.println(numMap);
		
		List<Entry<Integer, Integer>> collect = numMap.entrySet().stream().filter( t -> t.getValue()%2 != 0).collect(Collectors.toList());
		System.out.println(collect);
	}

}
