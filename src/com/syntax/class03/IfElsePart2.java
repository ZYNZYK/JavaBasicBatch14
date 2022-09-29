package com.syntax.class03;

public class IfElsePart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHungry = true;

		if (isHungry)
			System.out.println("Lets eat something yummy");

		if (3 > 2)
			;
		System.out.println("There is a true statements inside the paranthese");

		double myBankBalance = 2000;
		double theAmountThatIwantToTransfer = 2500;

		if (myBankBalance > theAmountThatIwantToTransfer)
			System.out.println("Funds transferred successfully");
		else
			System.out.println("Please try again, insuficient money");

		int money = 1000000;

		if (money >= 10000) {
			System.out.println("I'm rich");
			System.out.println("I can go on vacations");
			System.out.println("I can buy Tesla");

		} else {
			System.out.println("I need to save more");

		}

	}

}
