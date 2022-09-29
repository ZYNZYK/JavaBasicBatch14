package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I love java programming";
		
		System.out.println(str.charAt(1)); // 0=I, 1=space,2=l, etc.
		
		/*
		 * charAt gives us the character from the string
		 * or using str.length gives us all the characters
		 */
		
		for (int i=0; i<str.length(); i++) {
			
			if (! (str.charAt(i)==' ')) { //to avoid spaces
			
			System.out.println(str.charAt(i));
			
		}

	}

}
}