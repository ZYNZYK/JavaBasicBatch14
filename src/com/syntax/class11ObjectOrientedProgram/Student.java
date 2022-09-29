package com.syntax.class11ObjectOrientedProgram;

public class Student {

	String name;
	String id;
	int age;
	double weight;
	String gender;

	void study() {

		System.out.println("Student is studying");
	}

	void deleteMessages() {
		System.out.println("Deleting messages from Discord");
	}

	void eat() {
		System.out.println("Eating pizzzzzzzzzzzzzzzzzzzzaaaaaaaaaa...");
	}

	public static void main(String[] args) {

		// new Student =>Creates the object of Student CLass
		Student friadonOnObject = new Student();
		friadonOnObject.name = "Friadoon";
		friadonOnObject.id = "123";
		friadonOnObject.age = 22;

		System.out.println(friadonOnObject.name);
		System.out.println(friadonOnObject.id);
		System.out.println(friadonOnObject.age);

		friadonOnObject.deleteMessages();

		System.out.println("**************************");

		Student student2 = new Student();
		// next step assign smth or calling (void)
		student2.name = "Asma";
		student2.age = 16;
		student2.weight = 30;
		student2.gender = "F";
		System.out.println(student2.name);
		student2.eat();

	}

}
