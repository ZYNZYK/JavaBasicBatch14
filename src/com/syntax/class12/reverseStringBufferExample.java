package com.syntax.class12;

public class reverseStringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      
		String reverse="";
		StringBuffer sb =new StringBuffer("Hello Friends");
		      
		for (int i = sb.length()-1; i >= 0; i--) {
		  			reverse = reverse + sb.charAt(i);
		}       		
		      System.out.println(reverse);

	}

}
