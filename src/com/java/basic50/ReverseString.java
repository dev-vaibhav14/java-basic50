package com.java.basic50;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str = "vaibhav";
      int len = str.length();
      
      for(int i = len - 1; i >=0 ; i--)
      {
    	  System.out.print(str.charAt(i));
      }
	}

}
