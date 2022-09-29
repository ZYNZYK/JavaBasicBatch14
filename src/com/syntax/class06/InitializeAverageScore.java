package com.syntax.class06;

import java.util.Scanner;

public class InitializeAverageScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		System.out.println();
		System.out.println ("Whats your test score?");
		double Final = input.nextDouble();
		double score;
		int midterm = 0;
		int quiz = 0;
		score =(quiz+midterm+Final)/3;
		String grade=null;
		
		if (score >= 90 && score<=100) {
		grade = "A";
		} else if (score > 70 && score < 90) {
			grade = "B";
		} else if (score >= 50 && score < 70) {
			grade = "C";
		} else if (score < 50){
			grade = "F";
		} else {
			System.out.println("Please enter valid score!");
			grade="None";
		}
		System.out.println(grade);

	}

}
