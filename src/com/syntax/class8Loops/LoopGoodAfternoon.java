package com.syntax.class8Loops;

import java.util.Scanner;

public class LoopGoodAfternoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		for (int a=8;a<=10;a++) {
			
	System.out.println("Please enter your name");
	String name = scan.nextLine();
	
	System.out.println("Good afternoon "+ name);	
		}

	}
}

