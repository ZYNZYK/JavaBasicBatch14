package reviewClass5Loops;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println ("Enter the number");
		int i=scan.nextInt();
		
		while (i!=10) {
			System.out.println(i);
			i=scan.nextInt();

		}
		
	/*
	 * while(i!=10) {System.out.println(i
	; * 
	 */
		
		for (int y=0;i!=10; i=0) {
			System.out.println(i);
	//i=scan.nextInt();	
		
	}
		System.out.println("----------------------");
		// nested Loop examples
		
		for (int j=0;j<3; j++) {
			
			for (int a = 0; a<3;a++) {
				System.out.println(a);
			}
		}
		
		int b=0;
		while(b<3) {
			System.out.println(b);
			b++;
		}
	
		

	}
	}

