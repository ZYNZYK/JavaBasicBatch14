package com.syntax.class05nestedIfCondition;

public class NestedExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time=5;
		String day="Tuesday";
		 if(day.equals("Tuesday")) { 
//it is called "Outer if condition" IF its TRUE then only inner conditions will be checked 
			 //false nothing from inner conditions will be executed it is like the main door
			 //if the main door is closed we can't enter the building
			 
		
		 if(time>7) { //as String non primitive we can't use == sign, we have to use.equals -- inner condition
				 System.out.println("ler's go to office");
			 }
			 if(time<6) {
				 System.out.println("lets sleep more");
			 }
			 
		 }

	}

}