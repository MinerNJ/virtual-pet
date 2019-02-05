package virtualpet.robotic;

public class RoboticCat extends RoboticPet {

	public RoboticCat(String name) {
		super(name);
	}

	@Override
	public String vocalization() {
		return "Purrs and Hum";
	}
}
