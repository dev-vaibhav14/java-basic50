package com.java.basic50;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintFirstLetterOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "vaibhav mahajan";
		
		Pattern p = Pattern.compile("\\b[a-zA-Z]");
		
		Matcher m1 = p.matcher(str);
		
		while(m1.find())
			System.out.println(m1.group());

	}

}
