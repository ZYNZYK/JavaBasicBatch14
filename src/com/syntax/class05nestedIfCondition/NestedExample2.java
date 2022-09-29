package com.syntax.class05nestedIfCondition;

public class NestedExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double moneyInAccount=10000;
		String season="Spring";
		
		if(season.equals("Spring")) {
 if (moneyInAccount >3000) {
	 System.out.println("Lets go on vacations");
 } else {
	 System.out.println("i need to save more");
 }
	}
//====================================================================================
		double moneyInMyAccount=100;
		String seasons="Spring";
		
		if(season.equals("Spring")) {
 if (moneyInMyAccount >3000) {
	 System.out.println("Lets go on vacations");
 } else {
	 System.out.println("i need to save more");
 }
		}
	}
}
