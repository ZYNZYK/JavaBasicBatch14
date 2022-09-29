package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		
		/*
		 * Scanner-class that help us take the input from keyboard
		 * it cntais may different smaller modules called Methods that can help
		 * us take String booleans basically all types of data from keyboard
		 */

		Scanner input = new Scanner (System.in);
		// a message will be displayed to user on the console to enter his/her name
		System.out.println("Please enter your name");
		//activates Java to take the input from keyboard and store it inside the name variable
		String name=input.next();
		// prints whatever name user enters on the keyboard on the console
		System.out.println("Hello "+ name);
		
		
	}

}
