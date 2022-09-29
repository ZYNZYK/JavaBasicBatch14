package com.syntax.class10.TwoD;

public class Task1Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] [] name = new String [2] [4];
				//{"Mr","Mrs","Ms","Miss"};
				//{"Smith", "Jordan","Jackson", "Obama"};		
		//};
		
		name[0][0]="Mrs";
		name[0][1]="Mr";
		name[0][2]="Ms";
		name[0][3]="Miss";
		
		name[1][0]="Smith";
		name[1][1]="Obama";
		name[1][2]="Jackson";
		name[1][3]="ordan";
		
		System.out.println(name[0][0]+" "+name[1][0]);
;
		System.out.println(name[0][1]+" "+name[1][1]);
		
		System.out.println(name[0][2]+" "+name[1][2]);
		
		System.out.println(name[0][3]+" "+name[1][3]);




	}

}
