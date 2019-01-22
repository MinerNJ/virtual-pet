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
	}

	// Methods
	// Time - tick --> Increases all negative traits
	// Feed
	// Play
	// Walk
	// Affection

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
		happiness += 4;
	}

	public void feed() {
		hunger -= hunger;
		happiness -= happiness;
	}

	public void play() {
		boredom -= boredom;
		happiness -= happiness;
	}

	public void walk() {
		bladder -= bladder;
		happiness -= happiness;
	}

	public void hug() {
		loneliness -= loneliness;
		happiness -= happiness;
	}

}
