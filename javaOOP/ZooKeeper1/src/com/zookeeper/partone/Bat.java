package com.zookeeper.partone;

public class Bat extends Mammal {
	public Bat() {
		super.energyLevel = 300;
	}

	public void fly() {
		energyLevel -= 50;
		System.out.println("Fly fly fly");
		displayEnergy();

	}

	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Eat so well");
		displayEnergy();

	}

	public void attackTown() {
		energyLevel -= 100;
		System.out.println("people shouting on attack");
		displayEnergy();

	}

}
