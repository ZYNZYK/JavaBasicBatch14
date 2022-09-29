package com.syntax.class9Arrays;

public class HwArrayTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = { "Mercedes", "Lexys", "Infiniti", "Nissan", "Tesla", "Subaru" };

		for (String type : cars) {
			System.out.println(type);

		}
		System.out.println("***********************************");

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
