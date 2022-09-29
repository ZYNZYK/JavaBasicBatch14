package keyboardAssignment;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("What city are you from?");
		String city = scanner.nextLine();
		System.out.println("What temperature it is in your city?");
		 double temp = scanner.nextDouble();
		double Celsius = (temp-32)/1.8;
		System.out.println("The temperature in the city is "+ Celsius+ " celsius");
		 
		
	}

}
