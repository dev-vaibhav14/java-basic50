package com.java.basic50;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		
		int reversedNum = 0;
		
		while(num != 0)
		{
			int remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num = num / 10;
		}
		
		System.out.println(reversedNum);

	}

}
