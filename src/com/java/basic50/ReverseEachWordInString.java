package com.java.basic50;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav mahajan";
		
		int len = str.length();
		
		String [] words = str.split(" ");
		
		str = "";
		for(int i = 0; i < words.length ;i++)
		{
		  str = str + new StringBuilder(words[i]).reverse().toString()+ " ";	
		}
		
		System.out.println(str);

	}

}
