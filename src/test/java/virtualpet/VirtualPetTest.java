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

		pet.feed();

		assertEquals(9, pet.getHunger());

	}

	@Test
	public void shouldPlay() {
		VirtualPet pet = new VirtualPet("Kendrick", 0, 10, 0, 0, 0);

		pet.play();

		assertEquals(9, pet.getBoredom());

	}

	@Test
	public void shouldWalk() {
		VirtualPet pet = new VirtualPet("Kendrick", 0, 0, 10, 0, 0);

		pet.walk();

		assertEquals(9, pet.getBladder());

	}

	@Test
	public void shouldHug() {
		VirtualPet pet = new VirtualPet("Kendrick", 0, 0, 0, 10, 0);

		pet.hug();

		assertEquals(9, pet.getLoneliness());

	}

	@Test
	public void happinessCheck() {
		VirtualPet pet = new VirtualPet("Kendrick", 0, 0, 0, 0, 10);

		pet.feed();
		pet.play();
		pet.walk();
		pet.hug();

		assertEquals(6, pet.getHappiness());
	}
}
