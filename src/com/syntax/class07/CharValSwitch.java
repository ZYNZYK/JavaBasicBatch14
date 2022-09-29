package com.syntax.class07;

public class CharValSwitch {

	public static void main(String[] args) {
		char direction = 'N';
		char west = 'W';

		switch(direction) {
		case 'N':
		System.out.println("North");
		break;
		case 'E':
		System.out.println("East");
		break;
		case 'W': //west / West -->will show error
		System.out.println("West");
		break;
		case 'S':
		System.out.println("South");
		}
	}


	}
