package com.syntax.class12;

public class StringDemo7 {

	public static void main(String[] args) {

		String str="I am always confused I was kidding";
		
		System.out.println(str.indexOf("a")); // finding the index number 0 1 2 3
		
		System.out.println(str.indexOf("s")); //10
		System.out.println(str.indexOf(" "));// space index
		
		/*
		 * str.substring() gives you smaller string from a String we can start the starting
         * part to this method and it will return us the subString from that index
		 */
		
		System.out.println(str.substring(5)); // small string with that index
		
		System.out.println(str.substring(5,11));
		// int num=121232222;
	    //String numStr=String.valueOf(num).substring(1,3);
		//System.out.println(numStr);
		
		//num=Integer.parseInt(numStr);
		//System.out.println(num);
		

	}
	
}
