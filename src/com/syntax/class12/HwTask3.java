package com.syntax.class12;

import java.util.Scanner;

public class HwTask3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Mom, please enter your name");
		String momName=scan.nextLine();

		System.out.println("Dad, please enter your name");
		String dadName=scan.nextLine();

		System.out.println("What is your baby gender?");
		String gender = scan.nextLine();
	
		if (gender.equals("boy")) {
			System.out.println("I could suggest to name your baby " +dadName.substring(0,dadName.length()/2)+momName.substring(momName.length()/2));	
		} else {
			System.out.println("I could suggest to name your baby " +momName.substring(0,momName.length()/2)+dadName.substring(dadName.length()/2));
		}

	}

}