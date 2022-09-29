package com.syntax.class12;

public class StringDemoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Java"); // ("Java) 4
		String name="Zinaida Cantir the Queen of the Family";

		System.out.println(str.length());
		/*
		 * counts the number of a character in a string including the spaces ==>e.g 4
		 */

		//String name = "Java"; // only works for String and Wrapper Classes
		
		System.out.println(str.length());
		System.out.println((name.length()));
		if (name.length() > 15) {
			System.out.println("Name can not be more than 15 characters");
		}
		
		// ANTOHER EXAMPLE 
		  // Proper way of creating an object
      //  String str= new String("Java"); 
        // Simpler and shorter way provided by Java Creators to make our life a little easier
       // String name="Asma Alfadhli The Great"; // Only works for String and Wrapper classes
        /*
         * Counts the number of characters in a string including the spaces 
         */
        System.out.println(str.length());
        System.out.println(name.length());
        if(name.length()>15) {
            System.out.println("Name can't be more than 15 characters");
        }

	}

}
