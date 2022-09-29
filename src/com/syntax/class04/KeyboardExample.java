package com.syntax.class04;

import java.util.Scanner;

public class KeyboardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter your age");
		
		int age=scanner.nextInt(); // We use nextInt if we want an int type of data from keyboard

		if (age<18) {
			System.out.println("You should sudy more");
		} else {
			System.out.println("Start Working");
		}
		
		
		
	}

}
