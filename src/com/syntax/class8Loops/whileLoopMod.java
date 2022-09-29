package com.syntax.class8Loops;

public class whileLoopMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		while (i<=20) {
			if (i%2==0) {
				System.out.println(i+ " "); //2+1=3, is 3%2 => condition False, the code stops
				// i++; here it will stop
			}
			i++;
		}

	}

}
