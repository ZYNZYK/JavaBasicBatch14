package com.syntax.class8Loops;

import java.util.Scanner;

public class LoopGuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int secret = 1234;
		int guess;

		do {
			System.out.println("Please guess the secret number: ");
			guess = input.nextInt();

			if (secret == guess) {
				System.out.println("You won!");
			}
		} while (guess != secret);

	}

}
