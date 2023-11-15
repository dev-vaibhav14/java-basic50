package com.java.basic50;

public class ReplaceCharAtIndexInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="vaibhav";
		
		int index = 0;
		
		char ch = 'p';
		
		str = str.substring(0, index) + ch + str.substring(index+1);
		
		System.out.println(str);
		System.out.println(str.substring(7));
	}

}
