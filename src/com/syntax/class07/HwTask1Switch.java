package com.syntax.class07;

import java.util.Scanner;

public class HwTask1Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("What country are you from?");
		
		String country=in.next();
		String language;
		
		switch(country) {
		
		case "Moldova":
			language ="romanian";
			break;
		case "Turkey":
			language="turkish";
			break;
		case"France":
			language="french";
			break;
		case"United Kingdom":
			language="english";
			break;
		case"Ukraine":
			language="ucrainean";
			break;
		case"Italy":
			language="italian";
			break;
		case"Spain":
			language="spanish";
			break;
		case"Germany":
			language="deutsch";
			break;
		case"Arab Emirates":
			language="arabic";
			break;
			default:
				language="Unknown";
				break;
					
		}
		System.out.println("You are from "+ country + " your language is " + language);
		

	}

}
