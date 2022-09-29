package com.syntax.class9Arrays;

public class ArrayDemoWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] week= {"Monday","Sunday","Tuesday","Thursday","Friday"};
		
		for (String day:week) {
		//	System.out.println(day);
			if(day.equals("Sunday")) {
				System.out.println(day +" is a fun day");
			} else {
				System.out.println(day + " is a boring day");
			}
		} for (int i=0; i<week.length; i++) {System.out.println(week[i]);

	}

	}
}
