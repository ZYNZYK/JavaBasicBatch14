package com.syntax.class05nestedIfCondition;

public class examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// daca avem rest atunci nr este ODD
		//DACA nu avem rest atunci nr este Even, zero==even
		// no remanider == EVEN
		//yes remainde== ODD
		
		
		////// THIS IS NOT A NESTED EXAMPLE
		int number =5;
		System.out.println(5%2);
		
		if (number%2==0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	      int number1=2;

	        if(number>0)
	        {
	            System.out.println("Number is positive");
	        } else if(number<0)
	        {
	            System.out.println("Number is Negative");
	        } else {
	            System.out.println("Number is neither positive nor negative");
	        }
	}

}
