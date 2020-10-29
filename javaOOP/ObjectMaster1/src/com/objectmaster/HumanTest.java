package com.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human ninja1 = new Human();
		Human samurai1 = new Human();
		Human wizard1 = new Human();

		System.out.println("Ninja: " + ninja1);
		System.out.println("Samurai: " + samurai1);
		System.out.println("Wizard: " + wizard1);

		System.out.println("Wizard attacks Ninja");
		wizard1.attack(ninja1);

		System.out.println("Ninja: " + ninja1);
		System.out.println("Samurai: " + samurai1);
		System.out.println("Wizard: " + wizard1);

		System.out.println("Samurai attacks Ninja");
		samurai1.attack(ninja1);

		System.out.println("Ninja: " + ninja1);
		System.out.println("Samurai: " + samurai1);
		System.out.println("Wizard: " + wizard1);

		System.out.println("Ninja attacks Samurai");
		ninja1.attack(samurai1);

		System.out.println("Ninja: " + ninja1);
		System.out.println("Samurai: " + samurai1);
		System.out.println("Wizard: " + wizard1);

	}

}
