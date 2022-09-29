package com.syntax.class04;

import java.util.Scanner;

public class KeyboardComplexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Did you solve any Replit Assignments please enter True or False?");
		
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if (solvedAnyRepls)
		{
			System.out.println("How many repls you solved it?");
			int noOfReplsSolved=scanner.nextInt();
			
		
			if (noOfReplsSolved>17)
			{
				System.out.println("You are doing great!");
			} else if (noOfReplsSolved>10 ) {
				System.out.println("You are doing ok, Please complete them as soon as possible");
				} else {
					System.out.println(" You should solve some more Repls");
				}
		}
		else {
			System.out.println("They are very important to learn Java, please solve them!");
		}

	}

}
