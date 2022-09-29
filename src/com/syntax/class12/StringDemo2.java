package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName ="Olena";
		String lastName=" Dudka";
		System.out.println(firstName+lastName); //Concatenation
		System.out.println(firstName.concat(lastName));
		
		String str=" ";
		/*
		 * isEmpty its always boolean, returns true if a string is empty this method will returns false even if you have
		 * a space in a String variable however the isBlank method does not count the spaces
		 */
		System.out.println(str.isEmpty());
		
		//System.out.println(str.isBlank());
		

	}

}

