package keyboardAssignment;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("Do you have a credit card?");
        boolean creditCard = scanner.nextBoolean();
        if (creditCard) {
        	System.out.println("What it is your credit Card balance?");
        
		double money=scanner.nextDouble();
		if (money>1000) {
			System.out.println("Please make a payment immediatly");
        } else {
        	System.out.println("You can continue to spend more");
        } 
        } else {
        System.out.println("Would you like to apply for a credit Card?");
        
        }
        
	}
}
	
