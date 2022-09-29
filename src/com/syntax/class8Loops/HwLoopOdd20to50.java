package com.syntax.class8Loops;

public class HwLoopOdd20to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=21;
		while (i<=50) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println("-------------------------------");
		int odd=20;
		while (odd<=50) {
			if(odd%2==1)
			System.out.print(odd+" ");
			odd++;
		}

	}

}
