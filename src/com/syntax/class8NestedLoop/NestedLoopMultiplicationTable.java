package com.syntax.class8NestedLoop;

public class NestedLoopMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiplication loop
		
		for (int i=1; i<=9; i++) { // outer loop
			
			for (int j =1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j); //inner loop
			}
			System.out.println("-------------------");
		}

	}

}
