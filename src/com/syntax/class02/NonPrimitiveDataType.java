package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string with one example of NonRIMITIVE DATA TYPES
		String name ="Zina";
		
		String address = "3008 Poplar ave";
		
		String phone="407-541-3222"; //anything you put in "" its a STRING
		
		int age = (17);
		System.out.println(name);
		
		//Concatenate 2 string we use + sign
		//attach 2 strings
		System.out.println("Mu name is "+name);
		
		// Zina is 17
		System.out.println(name + " is " + age);
		
		String fruit="apple";
		double price= 1.99;
		char dollar = '$';
		
		//the price of the apple is 1.99
		System.out.println("The price of the " + fruit + " is " + price + dollar);
		
		fruit="mango";
		price = 5.99;
		//The Price of the mango is 5.99
		System.out.println("The price of the " + fruit + " is " + price + dollar);

		
			/* to attach any value (int, double, boolean, char, string etc)
			 * to a String we use +
			 * + next to the String acts as Concatenation
			 */
		////////////////////
		
		int c=9;
		int d=5;
		int remider = c%d;
		System.out.println(" remainder = " + c%d);

		int sum=c+d;
		int dif=c-d;
		
		System.out.println(sum);
		System.out.println(dif);
		int e=10;
		int f=5;
		
		System.out.println(" division =" + e/f); //2
		System.out.println(e%f); //0 remainder
		
		
		
	}

}
