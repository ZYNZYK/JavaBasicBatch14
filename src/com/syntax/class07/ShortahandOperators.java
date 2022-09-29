package com.syntax.class07;

public class ShortahandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		i = i + 9;
		System.out.println(i); // 19

		i = i - 5;
		System.out.println(i);// 14

		i = i * 2;
		System.out.println(i);// 28

		int a = 10; // shorthandOperator

		a += 9;
		System.out.println(a);// 19
		a -= 10;
		System.out.println(a);// 9
		a /= 2;
		System.out.println(a);// 2
		a *= 2;
		System.out.println(a);// 8
		a %= 4;
		System.out.println(a);// 0
		a += 1;
		System.out.println(a);// 1

	}

}
