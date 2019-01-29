package virtualpet;

public class VirtualPet {

	// Properties
	private String name;
	private int hunger;
	private int boredom;
	private int bladder;
	private int loneliness;
	private int happiness;

	// Constructor
	public VirtualPet(String name, int hunger, int boredom, int bladder, int loneliness, int happiness) {
		this.name = name;
		this.hunger = hunger;
		this.boredom = boredom;
		this.bladder = bladder;
		this.loneliness = loneliness;
		this.happiness = happiness;
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
		happiness -= 2;
	}

	public void play() {
		boredom -= 2;
		happiness -= 2;
	}

	public void walk() {
		bladder -= 2;
		happiness -= 2;
	}

	public void hug() {
		loneliness -= 2;
		happiness -= 2;
	}
	
	public void checkStatus() {
		System.out.println(name + " has a hunger of " + hunger + ", a boredom of " + boredom + ", a bladder of " + bladder
				+ ", a loneliness of " + loneliness + ", and a happiness of " + happiness + ".");
	} // Return a string that contains the status

}
