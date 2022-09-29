package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * type casting => type = data type casting = converting
		 * converting one data type to another data types = TYPE CASTING
		 * 
		 * we can use the code when is written by someone else
		 * merging the code easier
		 * converting smaller to large => its called: IMPLICIT or WIDENING,  easier, no errors, just assign the variables
		 * 
		 * 
		 * larger Data type to Smaller data type =>> called Explicit or Narrowing or Manual converter
		 * int box2=(int)box;
		 */
		
		 byte box1=127; //smallest box
		 short box2= 3333; // slightly large box, double the size of box1 in terms of bits 16 bits (8 bytes =1 bit)
		 int box3=45454545; //32 bits , large box most commonly used
		 long box4=45454545; // slight;y large box 64 bits
		 float box5=414564545; // even larger box, 32 bits
		 double box6=454545445;
		 short box=167;
		 byte box9=(byte)box;
		 System.out.println(box9);
		
		
		 int number=(int )15.2; //we can't store the decimal numb in a box of type double / float
		 System.out.println(number);
		 
		// e.g byte smallerBox=box2;
		 byte smallerBox=(byte) box2;
		 System.out.println(smallerBox);
		 
		 short biggerBox=box1;
		 
		 long box7=box1; //we can do this bcs box7 is larger than box1
		 
		 //float box8=box6; => as box6 is larger we need type casting to assign the value
		 float box8=(float) box6;
		 
		 char a=(char)66; //ascii table look
		 System.out.println(a);

	}

}
