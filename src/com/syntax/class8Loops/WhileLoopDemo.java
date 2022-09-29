package com.syntax.class8Loops;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time=11;

		if (time<12) {
		System.out.println ("Good morning");
		}

		while (time<12) {   //its a code in Java -->>> Loop -->repeat this block of code
		System.out.println ("Good morning"); // infinite loop
		
		/*
		 * to control my infinite loop we are using increment/decrement
		 */
		time ++;

	}

}
}
