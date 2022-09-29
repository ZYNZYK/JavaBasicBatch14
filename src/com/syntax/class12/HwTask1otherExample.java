package com.syntax.class12;

public class HwTask1otherExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is not my love";
		int length = str.length();
		if (!str.isEmpty() && str.length() % 2 != 0 && str.length() >= 3) {

			int middleIndex = str.length() / 2;
			System.out.println(str.charAt(middleIndex));
		}

	}

}
