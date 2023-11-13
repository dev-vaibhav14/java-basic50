package com.java.basic50;

public class IsStringContainsOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "1234b";

		int len = str.length();

		boolean isOnlyDigits = true;

		for (int i = 0; i < len; i++) {
			if (!Character.isDigit(str.charAt(i)))
				isOnlyDigits = false;

		}
		if (isOnlyDigits) {
			System.out.println("String contains all digits");
		} else {
			System.out.println("String contains Not all digits");
		}

	}

}
