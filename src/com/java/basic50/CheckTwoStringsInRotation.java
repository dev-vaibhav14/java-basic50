package com.java.basic50;

public class CheckTwoStringsInRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "ABCD";
		String str2 = "CDAB";
		
		String res = (str1.length() == str2.length() && (str1 + str2).contains(str2)) ? "Yes" : "No";
		
		System.out.println(res);

	}

}
