package keyboardAssignment;

import java.util.Scanner;

public class HwLoanSpecialist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
System.out.println(" What's the amount loan needed?");
		
		int loan = scanner.nextInt ();
	
		if (loan <= 200000) {
			System.out.println("You are eligible to get a loan");
		} else {
			System.out.println("Unforunately we can not approve you");

	}
	}
}
