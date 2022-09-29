package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1st way to create a variable
		byte b = 10; //create a variable and assign value
		
		
		//2nd way to create a variable
		int i;
		i=100; // assigning value
		 //variables creation only once
		//then we can use it as many times we need during the program
		
		//3rd way to create a variable = declare a variable
		int num1, num2, num3; // they are empty boxes that will store our values
		
		num1=100; // assigning value or initialize a variable
		num2=200;
		num3=300;
		
		System.out.println(num2);// the output will be 200
		
		//? Can I change a value of a variable??? - Yes
		num2=2500; //reassign the value, I can reassign as many times i want
		
		System.out.println(num2);// the output will be 2500
		// JAVA run from up to bottom
		
		//1 variable can hold only 1 value at 1 time/
		boolean boo = true;
		        boo = false;
		
	}

}
