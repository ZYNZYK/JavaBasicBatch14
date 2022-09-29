package keyboardAssignment;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" What's the Mortgage rate?");
		
		double rate = scanner.nextDouble ();
		
		if (rate > 4.5) {
			System.out.println("You are not eligible to buy a house");
		} else {
			System.out.println("Congratulations you are Approved");
		}
		System.out.println("What is the price of the House");
		
		int priceOfHouse=scanner.nextInt();
		if (priceOfHouse >200000) {
			System.out.println("I will take a loan");
		} else {
			System.out.println("I agree to pay cash");
		}

	}
		

	}

