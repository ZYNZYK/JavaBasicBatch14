package com.syntax.class8Loops;

import java.util.Scanner;

public class LoopCoffeeDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 2.85;
        double user=0.0;
        Scanner in= new Scanner(System.in);
        System.out.println("Please pay for the cofee");

        //Scanner in= new Scanner(System.in);
        //System.out.println("Please pay for the coffee");
        //user= in.nextDouble();
        
        do {
            user=in.nextDouble();
            
            if(user>price) {
            System.out.println("Please give lesser price");

            
            } else if(user<price){
                System.out.println("Please give more price");

            }
            
        } while(user!=price);

        System.out.println("Please enjoy your coffee");
        
		}
		

	}