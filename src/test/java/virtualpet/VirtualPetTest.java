package virtualpet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldBeAbleToCreatePet() {
		VirtualPet pet = new VirtualPet(null);

	}

	@Test
	public void petShouldHaveName() {
		VirtualPet underTest = new VirtualPet("Jeff");


		String actual = underTest.getName();

		assertEquals("Jeff", actual);
	}

	@Test
	public void shouldHaveDefaultHunger() {
		VirtualPet underTest = new VirtualPet("Steve");

		int actual = underTest.getHunger();

		assertTrue(actual > 0);
	}

	// Tick test example
	@Test
	public void shouldTick() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int beforeAction = pet.getHunger();
		pet.tick();
		int afterAction = pet.getHunger();

		assertEquals(beforeAction + 1, afterAction);
	}

	@Test
	public void shouldFeed() {
		VirtualPet pet = new VirtualPet("Kendrick");
		
		int beforeAction = pet.getHunger();
		pet.feed();
		int afterAction = pet.getHunger();

		assertEquals(beforeAction - 2, afterAction);

	}

	@Test
	public void shouldPlay() {
		VirtualPet pet = new VirtualPet("Kendrick");

		int beforeAction = pet.getBoredom();
		pet.play();
		int afterAction = pet.getBoredom();

		assertEquals(beforeAction - 2, afterAction);

	}

	@Test
	public void shouldWalk() {
		
		VirtualPet pet = new VirtualPet("Kendrick");

		int beforeAction = pet.getBladder();
		pet.walk();
		int afterAction = pet.getBladder();

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

	@Test
	public void happinessCheck() {
		VirtualPet pet = new VirtualPet("Kendrick");
		
		int beforeAction = pet.getHappiness();
		
		pet.feed();
		pet.play();
		pet.walk();
		pet.hug();
		
		int afterAction = pet.getHappiness();

		assertEquals(beforeAction - 8, afterAction);
	}

}
