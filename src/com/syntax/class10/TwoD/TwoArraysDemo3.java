package com.syntax.class10.TwoD;

public class TwoArraysDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] countries = {
				
				{"USA", "Canada"}, //1st Array with index 0 1
				{"Peru","Brazil","Colombia","Ecuador"},//2rnd array with index 0 1 2 3
				{"Ethiopia","Egipt","Kenya"},          //3rd array
				{"Italy","France","Moldova","Ukraine"},//4 array
				{"Kazakhstan","Afghanistan","Korea"}   //5th array	
		};
		
		System.out.println(countries.length); // 5 rows in all or arrays
		
		int elOf1arra=countries [0].length;
		System.out.println("# of elements from the 1st array = " + elOf1arra);
		
		int elOf2arra=countries [1].length;
		System.out.println("# of elements from the 2st array = " + elOf2arra);
		
		int elOf3arra=countries [2].length;
		System.out.println("# of elements from the 3st array = " + elOf3arra);
		
		System.out.println("--------- getting all values from 2nd array -------");
		
		for (int r=0;r<countries.length; r++) { //loops over the rows
			
			for (int c=0; c<countries[r].length; c++) {
				
				System.out.print(countries[r][c]+"  ");
			}
			System.out.println();

		}





	}

}
