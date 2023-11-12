package com.java.basic50;

import java.util.Arrays;

public class MinMaxFromIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {2,19,72,83,100,7};
		
		// using stream
		
		int min = Arrays.stream(arr).min().getAsInt();
		
		int max = Arrays.stream(arr).max().getAsInt();
		
		System.out.println("Min and max are " +  min + " and "  + max + " respectively");
		
		

	}

}
