package com.syntax.class06;

import java.util.Scanner;

public class Task3LogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
System.out.println("Please enter a number");

int num = scanner.nextInt();
if (num>=1 && num <=10) {
	System.out.println("The number is small");
}
else if (num>10 && num <100) {
	System.out.println("The number is medium");
}
else if (num>100 && num<1000) {
	System.out.println("The number is large");
}
	}

}
