package com.java.basic50;

public class RotateStringLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "India";
		
		int len = str.length();
		
		String ans = rotateStringLeft(str);
		
		System.out.println(ans);

	}

	private static String rotateStringLeft(String str) {
		String ans = str.substring(2)+ str.substring(0,2);
		return ans;
	}

}
