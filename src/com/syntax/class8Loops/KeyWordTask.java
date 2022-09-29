package com.syntax.class8Loops;

public class KeyWordTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < 50; i++) {
			if (i%3 ==0)
					 {
				continue;                           // skipping and continue to the next iteration/cycle
			}
			System.out.print((i + " "));
		}

	}

}
