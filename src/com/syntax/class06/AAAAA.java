package com.syntax.class06;

import java.util.Scanner;

public class AAAAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		   System.out.println("Do you need a loan?");
		   boolean loan =scanner.nextBoolean();
		   if  (loan==false) {
			   System.out.println("Unknown");
		   } else {
		    System.out.println("What is your credit score?");
		   }
		   int score=scanner.nextInt();
		   
		   if (score <600) {
		     System.out.println("The eligibility is Not eligible");
		   } else if (score>600 && score<700) {
		     System.out.println("The eligibility is Maybe eligible");
		   } else if (score>=701 && score <=800) {
		     System.out.println("The eligibility is Eligible");
		   } else if (score > 900) {
		     System.out.println("The eligibility is Definetly eligible");
		   }  else {
		     System.out.println("The eligibility is Unknown");
		  
		   }
		   
		}
		

	}
