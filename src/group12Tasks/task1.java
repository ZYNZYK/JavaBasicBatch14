package group12Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using Scanner create an array of integer values. After
		// the array is created, calculate the sum of all stored
		// elements in that array.

		Scanner input = new Scanner(System.in);
		System.out.println("enter arry lenght");
		int a = input.nextInt();

		int[] array = new int[a];

		System.out.println("enter Values:  \n");

		for (int i = 0; i < a; i++) {
			array[i] = input.nextInt();

		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			System.out.println(sum + " ");
		}

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the size of the array");

		int size = scanner.nextInt();

		int[] Zina = new int[size]; // Zina->>variable name
		Zina[0]=scanner.nextInt();
		
		for(int i=0;i<size;i++) {
			System.out.println("Please enter an int number");
			Zina[i] = scanner.nextInt();
			
		}
		System.out.println(Arrays.toString(Zina));
		for (int num:Zina) {
			sum+=num;
		}
		System.out.println("Sum of all the numbers from the Array is" + sum);
		

	}

}
