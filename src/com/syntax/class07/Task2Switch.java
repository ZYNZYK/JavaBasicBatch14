package com.syntax.class07;

import java.util.Scanner;

public class Task2Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade = in.next();

		String gradeExplanation = null;

		switch (grade) {

		case "A":
			gradeExplanation = "Excelent";
			break;
		case "B":
			gradeExplanation = "Good";
			break;
		case "C":
			gradeExplanation = "Average";
			break;
		case "D":
			gradeExplanation = "Bad";
			break;
		case "E":
			gradeExplanation = "Fail";
			break;
		case "F":
			gradeExplanation = "very bad";
			break;
		default:
			gradeExplanation = "Not acceptable";
			break;
		}
		System.out.println("Your grade is " + grade + " that means " + gradeExplanation);
	}

}
