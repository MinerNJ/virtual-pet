package virtualpet;

public class VirtualPet {
		private String name;
		private int hunger;
		private int boredom;
		private int bladder;
		private int affection;
		private int happiness;
		
		//Constructor
		public VirtualPet(String name, int hunger, int boredom, int bladder, int affection, int happiness) {
		this.name = name;
		this.hunger = hunger;
		this.boredom = boredom;
		this.bladder = bladder;
		this.affection = affection;
		this.happiness = happiness;
		}
		
		//Accessor Methods
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
		public int getAffection() {
		return affection;
		}
		public int getHappiness() {
		return happiness;
		}
}