package com.syntax.class8Loops;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hello 5 times:

		for (int i=1; i<=5; i++) {

		System.out.println("Hello!");

		}
		System.out.println("-----------------------");
		
		//print number from 1 to 20
		
		for (int i=1; i<=20;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("----------------");
		for (int i=30; i>=10;i--) {
			System.out.print(i+" ");
		}
		System.out.println("----------------");
		for (int i=0; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("----------------");
		//what is the output
		
		for (int i=10; i<=25; i+=5) {
			System.out.print(i+" ");
		}
		System.out.println("------------------");
		//whats the input?
		
		int sum=0;
		for (int i=1; i<=6; i++) {
			sum+=i;
		}
		System.out.print(sum);

	}

}
