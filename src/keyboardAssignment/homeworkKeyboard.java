package keyboardAssignment;

import java.util.Scanner;

public class homeworkKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Do you have a Diploma?");
		
		boolean diploma = scanner.nextBoolean ();
		
		if (diploma==true) {
			System.out.println("We want to Congratulate you!");
			System.out.println("whats your gpa score");
		
		float gpa = scanner.nextFloat ();
		
		if (gpa >=3.5) {
			System.out.println("You are eligible for scolarship");

		} else {
			System.out.println("You should have studied harder ");
			
		} 
		
		if (diploma==false) {
			System.out.println("we suggest to get a degree");
		} 
				}
	}
}
