package com.java.basic50;

public class PrintEvenLengthWordsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav mahajan pune";
		
		String[] split = str.split(" ");
		
		System.out.println(split.length);
		
		for(String st : split)
		{
			if(st.length()% 2 ==0)
				System.out.println(st);
		}

	}

}
