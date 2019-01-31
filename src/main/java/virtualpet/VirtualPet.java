package virtualpet;

import java.util.Random;

public abstract class VirtualPet {

	// Properties
	private String name;
	private int boredom;
	private int loneliness;

	// Constructor
	public VirtualPet(String name) {
		Random rng = new Random();
		this.name = name;
		this.boredom = rng.nextInt(10) + 6;
		this.loneliness = rng.nextInt(10) + 6;
	}

	// Accessor Methods
	public String getName() {
		return name;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getLoneliness() {
		return loneliness;
	}

	// time method
	public void allTick() {
		boredom += 1;
		loneliness += 1;
	}

	public void play() {
		boredom -= 2;
		if (boredom < 0) {
			boredom = 0;
		}
	}

	public void hug() {
		loneliness -= 2;
		if (loneliness < 0) {
			loneliness = 0;
		}
	}
}
