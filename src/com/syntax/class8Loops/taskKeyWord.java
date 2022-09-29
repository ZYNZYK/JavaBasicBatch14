package com.syntax.class8Loops;

import java.util.Scanner;

public class taskKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to buy? ");
		;
		String item = input.nextLine();
		System.out.println("How much does it cost?");
		double price = input.nextDouble();
		double money;
		double total = 0;
		do {
			System.out.print("How much money do you have? ");
			money = input.nextDouble();
			total += money;
			double need;
			double change;
			if (total < price) {
				need = price - total;
				System.out.println("You need to pay more " + need);
			} else if (total > price) {
				change = total - price;
				System.out.println("Here is your change " + change);
				break;
			}
		} while (total != price);
		System.out.println("Thank you for shopping");
	}
}
