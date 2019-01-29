package virtualpet;

public class RoboticPet extends VirtualPet {

	// Subclass properties
	private int batteryLife;
	private int oilGauge;
	private int maintenance;

	// Subclass Constructor
	public RoboticPet(String name) {
		super(name);
		this.batteryLife = 0;
		this.oilGauge = 0;
		this.maintenance = batteryLife + getBoredom() + oilGauge + getLoneliness();

	}

}
