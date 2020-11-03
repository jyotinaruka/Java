package com.zookeeper.partone;

public class Gorilla extends Mammal {

	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("The gorilla has thrown something!");
		displayEnergy();
	}

	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The gorilla eats some bananas and satisfied");
		displayEnergy();
	}

	public void climb() {
		energyLevel -= 10;
		System.out.println("The gorilla climbs a tree, but tired.");
		displayEnergy();
	}

}
