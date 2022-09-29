package com.syntax.class9Arrays;

public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[5];

		names[0] = "Oksana";
		names[1] = "Zina!";
		names[2] = "Vera!";
		names[3] = "Roman";
		names[4] = "Sonam";

		System.out.println("Hello " + names[1]);

		System.out.println("---------------------");
		
		String[] arr = new String[4];

		String[] names1 = { "Oksana", "Zina!", "Vera", "Roman", "Sonam" };

		System.out.println("Hello "+ names1[1]);
	}

}
