package com.syntax.class04;

import java.util.Scanner;

public class KeyboardInputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		//takes a String type input from keyboard and stores it in variable
		String name=scanner.nextLine();
		
		System.out.println("Please enter your age");
		int age=scanner.nextInt();
		
		System.out.println("Hi "+ name+ " you are "+ age+" years old");

	}
}
