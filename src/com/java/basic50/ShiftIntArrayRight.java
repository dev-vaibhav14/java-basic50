package com.java.basic50;

import java.util.Arrays;

public class ShiftIntArrayRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int len = arr.length;
		int noOfTimes = 1;
		for (int k = 0; k < noOfTimes; k++) {
			int j = arr[len - 1];
			for (int i = len - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = j;
		}
		System.out.println(Arrays.toString(arr));

	}

}
