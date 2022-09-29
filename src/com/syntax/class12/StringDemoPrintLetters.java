package com.syntax.class12;

import utils.StringUtils;

public class StringDemoPrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Thor love and thunder";

		for (int i = 0; i < str.length(); i++) {

			if(str.charAt(i)=='o') {
				System.out.println(i);
				 
			//	StringUtils strUtils=new StringUtils();
			       // strUtils.printAllIndexes(str, 'e');
			}
		}

	}

}
