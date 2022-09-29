package com.syntax.class10.TwoD;

public class Task2Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arr = {

				{ "Zina", "Vera", "Cris", "Oxana" }, 
				{ "A", "B", "C", "D" } // 2nd array
		};

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.println(arr[i][j]);
			}

	        String[][] var= {

	                {"Yusuf", "Hamza", "Adam", "John"},
	                {"A", "B", "C", "D"}
	        };


	        for(String[] singleArray:var) { //loops over 1d or single array

	            for(String el:singleArray) { //loops over each element of the 1dArray
	                System.out.print(el+"  ");
	            }

	            System.out.println();
	        }

	        System.out.println(" ---------------------------- ");


	        for(int k=0; k<var.length; k++) {

	            for (int j=0; j<var[i].length; j++) {
	                System.out.print(var[k][j]+"  ");
	            }
	            System.out.println();
	        }

	    }
		
	 for (int i=1;i<=4;i++){
	      for (int j=1;j<=4;j++){
	        if((i==2 && j==2) && (i==3 && j==3)) {
	            System.out.print("");
	          continue;
	          }
	        System.out.print("$");
	        }
	      System.out.println();
	      }
	}
	}
