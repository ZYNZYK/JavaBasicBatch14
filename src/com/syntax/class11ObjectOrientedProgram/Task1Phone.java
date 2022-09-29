package com.syntax.class11ObjectOrientedProgram;

public class Task1Phone {

	String name;
	String model;
	String color;
	boolean necessary;
	int memory;
	int camera;
	double size;
	int price;
	String image;
	int dimension;
	int depth;

	void waterproof() {
		System.out.println("It will be best if you will not dropp in the water");
	}

	void newPhone() {
		System.out.println("Its not new, but I like it");
	}

	void energySaver() {
		System.out.println("Depend how long are you using");
	}

	public static void main(String[] args) {

		Task1Phone iPhone = new Task1Phone();

		iPhone.model = "iPhone14";
		iPhone.color = "green";
		iPhone.memory = 256;
		iPhone.size = 6.1;
		iPhone.necessary = true;
		System.out.println("I would like to buy " + iPhone.model);
		System.out.println("My favorite iPhone color is " + iPhone.color);
		System.out.println("Is an iPhone necessary? " + iPhone.necessary);

		System.out.println("*****************************");

		Task1Phone Samsung = new Task1Phone();
		
		Samsung.price=800;
		Samsung.color="white";
		Samsung.name="Bixby";
		Samsung.model="S22";
		
		System.out.println("I bought a Samsung phone "+ Samsung.color+"color "+Samsung.name+" "+ Samsung.model+" and I paid "+Samsung.price);
		
		Task1Phone Pixel = new Task1Phone();
		Pixel.image= "2 dimensional grid";
		Pixel.depth=24;
		Pixel.dimension=1250;
		
		System.out.println("A pixel its a digital imaging " + "that arranged in a "+ Pixel.image+"," +" and some pictures can have a dimension of "+Pixel.dimension );
		
		
				

	}
}
