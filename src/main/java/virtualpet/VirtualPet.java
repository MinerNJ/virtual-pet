package virtualpet;

import java.util.Random;

public class VirtualPet {

	// Properties
	private String name;
	private int boredom;
	private int loneliness;

	// Constructor
	public VirtualPet(String name) {
		Random rng = new Random();
		this.name = name;
		this.boredom = rng.nextInt(25) + 1;
		this.loneliness = rng.nextInt(25) + 1;
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
			public void tick() {
				boredom += 1;
				loneliness += 1;
			}
		// Test a counter "clock", after so many "turns" all properties change

	public void play() {
		boredom -= 2;
	}

	public void hug() {
		loneliness -= 2;
	}
}
