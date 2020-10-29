package com.objectmaster;

public class HumanTest1 {

	public static void main(String[] args) {
		Human testHuman1 = new Human();
		Human testHuman2 = new Human();
		Human testHuman3 = new Human();
		Wizard testWizard1 = new Wizard();
		Wizard testWizard2 = new Wizard();
		Wizard testWizard3 = new Wizard();
		Ninja testNinja1 = new Ninja();
		Ninja testNinja2 = new Ninja();
		Ninja testNinja3 = new Ninja();
		Samurai testSamurai1 = new Samurai();
		Samurai testSamurai2 = new Samurai();
		Samurai testSamurai3 = new Samurai();

		testHuman1.attack(testSamurai3);
		testWizard1.fireball(testNinja2);
		testNinja2.steal(testHuman2);
		testSamurai1.attack(testHuman3);
		testWizard2.heal(testNinja2);
		testWizard3.fireball(testNinja3);
		testSamurai3.deathBlow(testNinja1);
		testSamurai2.meditate();
		testNinja1.runAway();
		testSamurai3.howMany();
	}

}
