package com.java.basic50;

public class PalindromeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		
		int reversedNum = reverseInteger(num);
		
		System.out.println(reversedNum);
		
		if(num == reversedNum)
		{
			System.out.println("Integers are Palindrome");
		}
		else
		{
			System.out.println("Integers are not palindrome");
		}

	}

	private static int reverseInteger(int num) 
	{
		// TODO Auto-generated method stub
		 int reversedNum = 0;
		 
		 while(num !=0)
		 {
			 int remainder = num % 10;
			 reversedNum = reversedNum * 10 + remainder;
			 num = num /10;
		 }
		return reversedNum;
	}

}
