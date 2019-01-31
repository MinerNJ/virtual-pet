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

// Accessor Methods
	public int getBatteryLife() {
		return batteryLife;
	}

	public int getOilGauge() {
		return oilGauge;
	}

	public int getMaintenance() {
		maintenance = batteryLife + getBoredom() + oilGauge + getLoneliness();
		return maintenance;
	}

	// time method
	public void tick(int turnCount) {
		if (turnCount % 5 == 0) {
			batteryLife += 1;
			oilGauge += 1;
		}
	}
	// Test a counter "clock", after so many "turns" all properties change

// Action methods
	public void charge() {
		batteryLife = 0; // Fully charge!
	}

	public void oilChange() {
		oilGauge = 0;
	}

	public void checkPerformanceLevel() {
		maintenance = batteryLife + getBoredom() + oilGauge + getLoneliness();
		System.out.println(getName() + "'s battery has been depleted by " + batteryLife + ", has a boredom of "
				+ getBoredom() + ", has burned " + oilGauge + " units of oil, has a loneliness of " + getLoneliness()
				+ ", and a performance of " + maintenance + ".");
	}

}
