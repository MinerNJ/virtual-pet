package virtualpet.robotic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import virtualpet.robotic.RoboticPet;

@SuppressWarnings("unused")
public class RoboticPetTest {

	@Test
	public void petShouldHaveName() {
		RoboticPet underTest = new RoboticPet("Jeff");

		String actual = underTest.getName();

		assertEquals("Jeff", actual);
	}

	@Test
	public void shouldHaveDefaultBatteryCharge() {
		RoboticPet underTest = new RoboticPet("Jeff");

		int actual = underTest.getBatteryLife();

		assertEquals(0, actual);
	}

	@Test
	public void shouldCharge() {
		RoboticPet underTest = new RoboticPet("Jeff");

		underTest.charge();
		int afterCharging = underTest.getBatteryLife();

		assertEquals(0, afterCharging);

	}

	@Test
	public void shouldBeAbleToChangeOil() {
		RoboticPet underTest = new RoboticPet("Jeff");

		underTest.oilChange();
		int afterOilChange = underTest.getOilGauge();

		assertEquals(0, afterOilChange);

	}

	@Test
	public void happinessCheck() {
		RoboticPet underTest = new RoboticPet("Jeff");

		int beforeAction = underTest.getPerformance();

		underTest.charge();
		underTest.play();
		underTest.oilChange();
		underTest.hug();

		int afterAction = underTest.getPerformance();

		assertEquals(beforeAction + 4, afterAction);
	}

	@Test
	public void tickCheck() {
		RoboticPet underTest = new RoboticPet(null);

		int a = underTest.getBatteryLife();
		int b = underTest.getBoredom();
		int c = underTest.getOilGauge();
		int d = underTest.getLoneliness();
		int e = underTest.getPerformance();

		underTest.tick(5);

		int a2 = underTest.getBatteryLife();
		int b2 = underTest.getBoredom();
		int c2 = underTest.getOilGauge();
		int d2 = underTest.getLoneliness();
		int e2 = underTest.getPerformance();

		assertEquals(a + 1, a2);
		assertEquals(b + 1, b2);
		assertEquals(c + 1, c2);
		assertEquals(d + 1, d2);
		assertEquals(e - 4, e2);
	}

}
