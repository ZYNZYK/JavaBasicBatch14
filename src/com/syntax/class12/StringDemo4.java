package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {

		String str = "Shah";
		String str2 = "Shah";
		String str3 = new String("Shah");

		// if (str.equals(str3)) {
		if (str == str2) {// str==str3 =>>> false

			System.out.println("I found it");

		}
		/*
		 * equals checks if two String are exactly the same exact same case
		 * equalsIgnoreCase if two String are exactly the same but does not care about
		 * case of letters
		 */

		if (str.equalsIgnoreCase("shah")) {
			System.out.println("I found it with equalsIgnoreCase");
		}

	}
}
