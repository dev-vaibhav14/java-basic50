package com.java.basic50;

import java.util.Arrays;

public class SegregateZeroAndOneInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,1,0,1,0,0,1,0,0,1,0};
		
	    int len = arr.length;
	    
	    int count = 0;
	    
	    for(int i = 0; i < len; i++)
	    {
	    	if(arr[i] == 0)
	    		count++;
	    }
	    
	    for(int i = 0; i< len; i++)
	    {
	    	if(i < count)
	    	{
	    		arr[i] = 0;
	    	}
	    	else
	    	{
	    		arr[i] = 1;
	    	}
	    }
	    
	    System.out.println(Arrays.toString(arr));

	}

}
