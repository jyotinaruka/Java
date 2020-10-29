package com.objectmaster;

public class Human {

	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	int health = 100;

	//// Constructors
	public Human() {

	}

	// getter/setter

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void attack(Human attackedHuman) {
		attackedHuman.health -= this.strength;
	}

	@Override
	public String toString() {
		return "Human [strength=" + strength + ", stealth=" + stealth + ", intelligence=" + intelligence + ", health="
				+ health + "]";
	}
}
