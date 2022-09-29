package com.syntax.class9Arrays;

public class HW4Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[5];
		
		num[0]=413;
		num[1]=12;
		num[2]=18;
		num[3]=67;
		num[4]=10;
		
		int largest=0;
		for (int value:num) {
			
			if (value>largest) {
				largest=value;
				System.out.println("The largest number is "+ largest);
			}
		}
		
	}

//int total;
//for (int i = 0; i < array.length; i++) {
  //  for (int k = 0; k < array[i].length; k++) {
      //  total = total + array[i][k];
        
       // for(int num:arr){
         //   sum=sum+num;
       //   }
        //   System.out.println(sum);
           
          // for (int k = 0; k < arr[i].length; k++) {
        	   
         //  }
    }

