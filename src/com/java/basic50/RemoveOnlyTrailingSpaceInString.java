package com.java.basic50;

public class RemoveOnlyTrailingSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav        ";
		
		int len = str.length();
		int k = len;
		for(int i = len -1 ; i >= 0 ; i--)
		{
			if(!Character.isWhitespace(str.charAt(i)))	
				break;
		 k--;
		}
		
		System.out.println(k);
		System.out.println(str.substring(0, k)+"@");

	}

}
