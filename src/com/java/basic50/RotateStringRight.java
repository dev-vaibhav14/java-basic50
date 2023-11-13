package com.java.basic50;

public class RotateStringRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "India";
		
		int noOfTimes = 1;
		
		int len = str.length();
		
		String ans = rotateStringRight(str, len);
		System.out.println(ans);
		
	
	}

	private static String rotateStringRight(String str, int len) {
		String ans = str.substring(len -2 )+str.substring(0, len - 2);
		return ans;
	}

}
