package virtualpet;

import java.util.Random;

public class OrganicPet extends VirtualPet {

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

<<<<<<< HEAD
	public void checkStatus() {
	// Return a string that contains the status
		System.out.println(getName() + " has a hunger of " + hunger + ", a boredom of " + getBoredom()
				+ ", a bladder of " + bladder + ", a loneliness of " + getLoneliness() + ", and a happiness of "
				+ this.getHappiness() + " out of 100.");
	}

=======
>>>>>>> f8dd799d4a1e008a5b55b8eba692ebc28b2ff26e
}
