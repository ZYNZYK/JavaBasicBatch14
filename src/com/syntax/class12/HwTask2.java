package com.syntax.class12;

public class HwTask2 {
	public static void main(String[] args) {

		String str = "Sunday";
		int size = str.length();
		String reverse = "";
		
		char[]charArr=str.toCharArray();

		// print the string in reverse order
		for (int i = size - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}
}
