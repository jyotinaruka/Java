package com.objectmaster;

public class Samurai extends Human {
	static int samuraiCount = 0;

	public Samurai() {
		health = 200;
		samuraiCount += 1;
	}

	public void deathBlow(Human human) {
		human.health = 0;
		this.health /= 2;

	}

	public void meditate() {
		this.health *= 0.5;

	}

	public int howMany() {
		System.out.println(samuraiCount);
		return samuraiCount;
	}

}
