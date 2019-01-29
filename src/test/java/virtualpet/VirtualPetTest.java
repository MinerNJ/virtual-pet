package virtualpet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void petShouldHaveName() {
		VirtualPet underTest = new VirtualPet("Jeff");

		String actual = underTest.getName();

		assertEquals("Jeff", actual);
	}

	@Test
	public void shouldHaveDefaultBoredom() {
		VirtualPet underTest = new VirtualPet("Steve");

		int actual = underTest.getBoredom();

		assertTrue(actual > 0);
	}

//	// Tick test:
//	@Test
//	public void shouldTick() {
//		VirtualPet pet = new VirtualPet("Kendrick");
//
//		int beforeAction = pet.getHunger();
//		pet.tick();
//		int afterAction = pet.getHunger();
//
//		assertEquals(beforeAction + 1, afterAction);
//	}

	@Test
	public void shouldPlay() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int beforeAction = pet.getBoredom();
		pet.play();
		int afterAction = pet.getBoredom();

		assertEquals(beforeAction - 2, afterAction);

	}

	@Test
	public void shouldHug() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int beforeAction = pet.getLoneliness();
		pet.hug();
		int afterAction = pet.getLoneliness();

		assertEquals(beforeAction - 2, afterAction);

	}

}
