package com.java.basic50;

public class RemoveAllLowerCaseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "VAIBHav";
		
		int len = str.length();
		
          
		str = str.replaceAll("[a-z]", "");
		
		System.out.println(str);
		
		
		
		

	}

}
