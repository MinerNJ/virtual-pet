package virtualpet;

import java.util.Random;

public class VirtualPet {

	// Properties
	Random rng = new Random();

	private String name;
	private int hunger;
	public int boredom;
	private int bladder;
	public int loneliness;
	private int happiness;

	// Constructor
	public VirtualPet(String name) {
		this.name = name;
		this.hunger = rng.nextInt(25) + 1;
		this.boredom = rng.nextInt(25) + 1;
		this.bladder = rng.nextInt(25) + 1;
		this.loneliness = rng.nextInt(25) + 1;
		this.happiness = hunger + boredom + bladder + loneliness;
	} // Random generator goes here!

	// Accessor Methods
	public String getName() {
		return name;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getBladder() {
		return bladder;
	}

	public int getLoneliness() {
		return loneliness;
	}

	public int getHappiness() {
		happiness = hunger + boredom + bladder + loneliness;
		return happiness;
	}

	// time method
	public void tick() {
		int time = 1;
		hunger += time;
		boredom += time;
		bladder += time;
		loneliness += time;
		happiness += 2;
	}

	public void feed() {
		hunger -= 2;
	}

	public void play() {
		boredom -= 2;
	}

	public void walk() {
		bladder -= 2;
	}

	public void hug() {
		loneliness -= 2;
	}

	public void checkStatus() {
		happiness = hunger + boredom + bladder + loneliness;
		System.out.println(name + " has a hunger of " + hunger + ", a boredom of " + boredom + ", a bladder of "
				+ bladder + ", a loneliness of " + loneliness + ", and a happiness of " + happiness + ".");
	} // Return a string that contains the status

}
