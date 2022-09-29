package keyboardAssignment;

import java.util.Scanner;

public class DMV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter your first name");
		String name=scanner.nextLine();

		
		System.out.println("Print your age");
		
		int age = scanner.nextInt();
		 
		if (age>18) {
		 System.out.println("Congratulation you got your Driver's license");
		 
		 } else {
			 System.out.println(" Congratulations, temporarily you will get you Learner Permit");
		 
		 }
	}
}