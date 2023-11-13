package com.java.basic50;

public class SwapNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swap : a = " + a + " and b = "+  b);
		
		a = a + b ;
		b = a - b;
		a = a - b ;
		
		System.out.println("After Swap : a = " + a + " and b = "+  b);
		

	}

}
