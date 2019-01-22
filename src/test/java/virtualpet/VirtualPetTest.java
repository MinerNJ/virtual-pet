package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldBeAbleToCreatePet() {
		VirtualPet pet = new VirtualPet(null, 0, 0, 0, 0, 0);
	}

	@Test
	public void petShouldHaveName() {
		VirtualPet underTest = new VirtualPet("Jeff", 0, 0, 0, 0, 0);

		String actual = underTest.getName();

		assertEquals("Jeff", actual);
	}

	@Test
	public void shouldHaveDefaultHunger() {
		VirtualPet underTest = new VirtualPet("Steve", 10, 0, 0, 0, 0);

		int actual = underTest.getHunger();

		assertEquals(10, actual);
	}

	// Tick test example
	@Test
	public void shouldTick() {
		VirtualPet pet = new VirtualPet("Kendrick", 0, 0, 0, 0, 0);

		int initialHunger = pet.getHunger();
		pet.tick();
		int hungerAfterTick = pet.getHunger();

		assertEquals(initialHunger + 1, hungerAfterTick);
	}

	@Test
	public void shouldFeed() {
		VirtualPet pet = new VirtualPet("Kendrick", 10, 0, 0, 0, 0);

		int initialHunger = pet.getHunger();
		int hungerAfterFeed = initialHunger - 1;

		assertEquals(initialHunger - 1, hungerAfterFeed);

	}

	@Test
	public void shouldPlay() {
		VirtualPet pet = new VirtualPet("Kendrick", 0, 10, 0, 0, 0);

		int initialBoredom = pet.getBoredom();
		int boredomAfterPlay = initialBoredom - 1;

		assertEquals(initialBoredom - 1, boredomAfterPlay);

	}

	@Test
	public void shouldWalk() {
		VirtualPet pet = new VirtualPet("Kendrick", 0, 0, 10, 0, 0);

		int initialBladder = pet.getBladder();
		int bladderAfterWalk = initialBladder - 1;

		assertEquals(initialBladder - 1, bladderAfterWalk);

	}

	@Test
	public void shouldHug() {
		VirtualPet pet = new VirtualPet("Kendrick", 0, 0, 0, 10, 0);

		int initialLoneliness = pet.getLoneliness();
		int lonelinessAfterHug = initialLoneliness - 1;

		assertEquals(initialLoneliness - 1, lonelinessAfterHug);

	}

	@Test
	public void happinessCheck() {
		VirtualPet pet = new VirtualPet("Kendrick", 0, 0, 0, 0, 10);

		int initialHappiness = pet.getHappiness();
		int happinessAfter = initialHappiness - 4;

		assertEquals(initialHappiness - 4, happinessAfter);
	}
}
