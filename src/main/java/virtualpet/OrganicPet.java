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
		this.hunger = rng.nextInt(25) + 1;
		this.bladder = rng.nextInt(25) + 1;
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
		happiness = hunger + getBoredom() + bladder + getLoneliness();
		return happiness;
	}

//		// time method
//		public void tick() {
//			int time = 1;
//			hunger += time;
//			boredom += time;
//			bladder += time;
//			loneliness += time;
//			happiness += 2;
//		}
	// Test a counter "clock", after so many "turns" all properties change

	public void feed() {
		hunger -= 2;
	}

	public void walk() {
		bladder -= 2;
	}

	public void checkStatus() {
		happiness = hunger + getBoredom() + bladder + getLoneliness();
		System.out
				.println(getName() + " has a hunger of " + hunger + ", a boredom of " + getBoredom() + ", a bladder of "
						+ bladder + ", a loneliness of " + getLoneliness() + ", and a happiness of " + happiness + ".");
	} // Return a string that contains the status

}
