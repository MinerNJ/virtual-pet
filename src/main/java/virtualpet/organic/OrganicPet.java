package virtualpet.organic;

import java.util.Random;

import virtualpet.VirtualPet;

public abstract class OrganicPet extends VirtualPet {

	// Properties
	private int hunger;
	private int bladder;
	private int health;

	// Constructor
	public OrganicPet(String name) {
		super(name);
		Random rng = new Random();
		this.hunger = rng.nextInt(10) + 6;
		this.bladder = rng.nextInt(10) + 6;
		this.health = hunger + getBoredom() + bladder + getLoneliness();
	}

	// Accessor Methods
	public int getHunger() {
		return hunger;
	}

	public int getBladder() {
		return bladder;
	}

	public int getHealth() {
		health = 100 - (hunger + getBoredom() + bladder + getLoneliness());
		if (health<0) {
			health = 0;
		}
		return health;
		}
		

	// time method
	public void tick(int turnCount) {
		if (turnCount % 5 == 0) {
			this.allTick();
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

}
