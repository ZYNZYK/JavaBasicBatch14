package keyboardAssignment;

import java.util.Scanner;

public class AnnualSalaryNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("How many years did you worked");
		
		int years = scanner.nextInt();
		
		System.out.println("What is you annual salary");
		
		int salary=scanner.nextInt();
		
		if (years>=5);{
			System.out.println("You are eligible for the bonus");
			
		} if (salary>50000){
			System.out.println("You will get a 5000$ bonus");
		} else {
			System.out.println("Your bonus will be 300$");
		}
		   }  {
			System.out.println("You are not eligible for bonus");
		}
		

	}