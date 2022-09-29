package com.syntax.class8Loops;

public class KeyWordContinue {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		for (int i = 1; i < 5; i++) {

			if (i == 3) {
				continue; // skip the condition ==3, it will print 1,2,4
			}

			System.out.println("Hello!");
			System.out.println("How are you?");
			System.out.println(i);

		}

		System.out.println("--------------------"); 
		
		for (int i = 1; i < 20; i++) {
			if (i == 3 || i == 7 || i == 11) {
				continue;                           // skipping and continue to the next iteration/cycle
			}
			System.out.println((i + " "));
		}
	}
}
