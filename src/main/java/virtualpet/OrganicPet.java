package virtualpet;

import java.util.Random;

public class OrganicPet extends VirtualPet {

	// Properties
	private int hunger;
	private int bladder;
	private int happiness;

	// Constructor
	public OrganicPet(String name) {
		super(name);
		Random rng = new Random();
		this.hunger = rng.nextInt(10) + 6;
		this.bladder = rng.nextInt(10) + 6;
		this.happiness = hunger + getBoredom() + bladder + getLoneliness();
	}

	// Accessor Methods
	public int getHunger() {
		return hunger;
	}

	public int getBladder() {
		return bladder;
	}

	public int getHappiness() {
		happiness = 100 - (hunger + getBoredom() + bladder + getLoneliness());
		return happiness;
	}

	// time method
	public void tick(int turnCount) {
		if (turnCount % 5 == 0) {
			hunger += 1;
			bladder += 1;
		}
	}

	public void feed() {
		hunger -= 2;
		if (hunger < 0) {
			hunger = 0;
		}
	}

	public void walk() {
		bladder -= 2;
		if (bladder < 0) {
			bladder = 0;
		}
	}

	public void checkStatus() {
		happiness = hunger + getBoredom() + bladder + getLoneliness();
		System.out.println(getName() + " has a hunger of " + hunger + ", a boredom of " + getBoredom()
				+ ", a bladder of " + bladder + ", a loneliness of " + getLoneliness() + ", and a happiness of "
				+ this.getHappiness() + " out of 100.");
	}

}
