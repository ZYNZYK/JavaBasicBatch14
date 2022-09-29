package com.syntax.class06;

import java.util.Scanner;

public class HWLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What hour is it now");
		int hour =input.nextInt();
		if(hour>=1 && hour <=11) {
		System.out.println("It's Morning");
		} else if (hour>=12 && hour<=15) {
			System.out.println("It's Afternoon");
		} else if (hour>=16 && hour <20) {
			System.out.println("It's Evening");
		} else if (hour>=21 && hour<=24) {
			System.out.println("It'sNight");
		}
	}
		
		
	}


