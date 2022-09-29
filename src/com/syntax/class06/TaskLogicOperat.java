package com.syntax.class06;

import java.util.Scanner;

public class TaskLogicOperat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your hight");
			
		double height =scanner.nextDouble() ;
		
		if (height < 60) {
			System.out.println("You are short");
		}
		else if (height >=60 && (height <=72)) {
			System.out.println ("You are medium height");
		}
		else {
			System.out.println("You are tall");
		} 
			
		}

	}
