package com.syntax.class9Arrays;

public class hw2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animals = { "Lion", "Tiger", "Wolf", "Rabbit", "Dog" };

		for (String type : animals) {
			System.out.println(type);

		}
		System.out.println("***********************************");

		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
		}

	}

}
