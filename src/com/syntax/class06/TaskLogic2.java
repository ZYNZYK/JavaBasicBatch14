package com.syntax.class06;

import java.util.Scanner;

public class TaskLogic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the day");
		int i=scanner.nextInt();
		
if (i>=1 && i<=5) {
	System.out.println("It is a weekday");
} else if (i==6 || i ==7) {
	System.out.println("It is a weekend");
}

}
		
	}

