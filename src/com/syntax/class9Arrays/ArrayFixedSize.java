package com.syntax.class9Arrays;

public class ArrayFixedSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[3];
		nums[1] = 12;
		nums[2] = 13;
		System.out.println(nums[1]);

		String[] colors = new String[3];
		colors[0] = "Red";
		colors[1] = "Pink";
		colors[2] = "Yellow";
		// colors[3]="Black"; // will show an error because [4], out of Bounds, I store
		// 3 value not 4
		System.out.println(colors[2]);

	}

}
