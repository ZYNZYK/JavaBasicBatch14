package com.syntax.class06;

import java.util.Scanner;

public class HWInitializing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What month it's your birthday?");
		String month = input.nextLine();
		String birthSeason = null;
		
		if (month.equals ("March") || month.equals("April") || month.equals("May")){
			birthSeason="The season in which you were born is Spring!";
		} else if (month .equals ("June") || month.equals ("July") || month.equals ("August")) {
			birthSeason="The season in which you were born is Summer";
		} else if (month.equals ("September") || month.equals ("October") || month.equals ("November")) {
			birthSeason="The season in which you were born is Fall";
		} else if (month.equals ( "December") || month.equals ("January") || month.equals ("February")) {
			birthSeason="The season in which you were born is Winter";
		}
		System.out.println(birthSeason);

	}

	}

