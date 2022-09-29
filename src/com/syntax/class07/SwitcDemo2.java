package com.syntax.class07;

public class SwitcDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * can not use LOGICAL OPERATORS
		 * case not use relational operators (</>/=/!)
		 * 
		 *  no duplicates case in switch
		 *  matching cases must of same data type as a variable in switch
		 *  
		 *  can not work with boolean values
		 *  
		 *  can not work with float/double and long data types
		 *  
		 *  
		 */
		char choice = 'K';
		String answer;
		
		switch (choice) {

		case 'Y':
			answer = "Yes";
			break;
	//  case 'Y':
	//		answer="Yessss";
			
		case 'N':
			answer = "No";
			break;

		case 'M':
			answer = "Maybe";
		default:
			answer = "Unknown";
			break;
		}
		System.out.println(answer);

	}

}
