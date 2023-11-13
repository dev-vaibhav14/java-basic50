package com.java.basic50;

public class CountWordsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav mahajan";
		
		int len = str.length();
		str = str.trim();
		String [] words = str.split(" ");
		
		System.out.println("Number of words present in string " + str  + " are " + words.length);

	}

}
