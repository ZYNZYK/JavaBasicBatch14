package com.syntax.class9Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[4]; // 4 - specify how many object we want to store in the container

		// store elements inside an array, using Indexes
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		// accessing elements from the array

		System.out.println(arr[2]);

		System.out.println(arr[1] + arr[2]); // sum

		// Lets create an array and store your classmates

		String[] names = new String[5];

		names[0] = "Oksana";
		names[1] = "Zina";
		names[2] = "Vera!";
		names[3] = "Roman";
		names[4] = "Sonam";

		System.out.println("Hello " + names[2]);

	}

}
