package virtualpet.robotic;

import virtualpet.VirtualPet;
import virtualpet.interfaces.Purr;

public abstract class RoboticPet extends VirtualPet implements Purr {

	// Subclass properties
	private int batteryLife;
	private int oilGauge;
	private int performance;

	// Subclass Constructor
	public RoboticPet(String name) {
		super(name);
		this.batteryLife = 0;
		this.oilGauge = 0;
		this.performance = batteryLife + getBoredom() + oilGauge + getLoneliness();
	}

// Accessor Methods
	public int getBatteryLife() {
		return batteryLife;
	}

	public int getOilGauge() {
		return oilGauge;
	}

	public int getPerformance() {
		performance = 100 - (batteryLife + getBoredom() + oilGauge + getLoneliness());
		return performance;
	}

	// time method
	public void tick(int turnCount) {
		if (turnCount % 5 == 0) {
			this.allTick();
			batteryLife += 1;
			oilGauge += 1;
		}
	}

// Action methods
	public void charge() {
		batteryLife = 0; // Fully charge!
	}

	public void oilChange() {
		oilGauge = 0;
	}

	@Override
	public String vocalization() {
		return "Hum";
	}

}
