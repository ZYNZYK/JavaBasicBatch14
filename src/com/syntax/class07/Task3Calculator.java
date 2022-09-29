package com.syntax.class07;

import java.util.Scanner;

public class Task3Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter 1st number");
		double num1 = in.nextDouble();

		System.out.println("Please enter the 2nd number");
		double num2 = in.nextDouble();

		System.out.println("Please provide the operator you want to use");
		char operator = in.next().charAt(0);
		double result = 0 ;
		
		if (operator =='+');{
		System.out.println(num1+num2);
			} if (operator =='-') {
				result=(num1-num2);
			} else if (operator=='*') {
				result= (num1*num2);
			} else if (operator=='/') {
				result=(num1/num2);
			} else {
				System.out.println("Print a valid operator");
				}

		System.out.println("----------------------");
		
		switch (operator) {

		case '+':
			result = (num1 + num2);
			break;
		case '-':
			result = (num1 - num2);
			break;
		case '*':
			result = (num1 * num2);
			break;
		case '/':
			result = (num1 / num2);
			break;
		default:
			System.out.println("Print a valid operator");

		}
 
		System.out.println("The result is " + result);
	}
}

		
	
	
