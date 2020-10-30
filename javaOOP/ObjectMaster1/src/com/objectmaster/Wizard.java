package com.objectmaster;

public class Wizard extends Human {
	public Wizard() {
		health = 50;
		intelligence = 8;

	}

	public void heal(Human wounded) {
		wounded.health += this.intelligence;

	}

	public void fireball(Human attacked) {
		attacked.health -= this.intelligence * 3;

	}

}
