package com.syntax.class06;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean boo1=!false;
		System.out.println(boo1);//false
		boolean rain=true;
		if(!rain) {
			System.out.println("I will go for a walk");
		}
		
		String day="Sunday";
		if(!day.equals("Sunday")) {
		System.out.println("Today is not Sunday");
		}
		
		boolean checkbox=true; //=false;
				
				if (!checkbox) {
					System.out.println("Then I will click and select it");
				}
		
	}

}
