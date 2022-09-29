package com.syntax.class12;

import java.util.Scanner;

public class writingNamesShortSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String name[] = new String[5];
		System.out.println("Please write 5 names");
		for (int i = 0; i < 5; i++) {
			name[i] = scan.next();
			if (name[i].length() > 3) {
				System.out.println(name[i].substring(0, 3));
			}
		}

	}

}
