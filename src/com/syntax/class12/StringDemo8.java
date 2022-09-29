package com.syntax.class12;

public class StringDemo8 {

	public static void main(String[] args) {
		String str = "Batch 14 is good 8748475895hcvfd dhdf34756436 ###$#@#$@#SDDSASD";
		/*
		 * replace method replaces one String with another in a String
		 * replaceAll it takes a pattern and replace all the characters that follow that pattern
		 * 
		 */
		System.out.println(str.replace("good", "Excellent"));

		System.out.println(str.replaceAll("[a-z]", ""));
	}

}
