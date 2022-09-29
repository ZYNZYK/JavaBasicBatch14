package com.syntax.class06;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean understandJava=true;
        boolean enjoyJava=true;
        boolean practice=true;

        if(understandJava && enjoyJava && practice) {
            System.out.println("This is awesome");
        }
////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////
        
        System.out.println("  another example   ");
		int n1=100;
		int n2=100;
		int n3=300;
		if (n1>n2 && n1>n3) {
			System.out.println(n1 + "is the largest");
		} else if (n2>n3 && n2 >n1) {
			System.out.println(n2+" is the largest");
		} else if (n3>n1 && n3>n2) {
			System.out.println(n3+" is the largest");
		}
	}
}
		
		///if (num1>num2&&num1>num3) {
		    //System.out.println("The largest number is "+num1);
		//  }
		 // if (num2>num1&&num2>num3) {
		    ///System.out.println("The largest number is "+num2);
		 // }
		 // if (num3>num2&&num3>num1) {
		//    System.out.println("The largest number is "+num3);
		 // }

	///}

//}
