package com.syntax.class12;

import java.util.Arrays;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love java programming";
		/*
		 * toCharArray will convert a String to an array of chars
		 */
		char[] charArray = str.toCharArray();

		System.out.println(Arrays.toString(charArray));
		System.out.println(charArray[7]);
		
		int counter=0;
		for (char a:charArray) {
			
			if (a =='a') {
				counter++;
			}
		}
		System.out.println("letter 'a' has appeared " + counter+ " times" );

	}

}
