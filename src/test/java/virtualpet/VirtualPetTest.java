package virtualpet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import virtualpet.organic.OrganicPet;

public class VirtualPetTest {

	@Test
	public void petShouldHaveName() {
		VirtualPet underTest = new OrganicPet("Jeff");

		String actual = underTest.getName();

		assertEquals("Jeff", actual);
	}

	@Test
	public void shouldHaveDefaultBoredom() {
		VirtualPet underTest = new OrganicPet("Steve");

		int actual = underTest.getBoredom();

		assertTrue(actual > 0);
	}

	@Test
	public void shouldPlay() {
		VirtualPet pet = new OrganicPet("Kendrick");

		int beforeAction = pet.getBoredom();
		pet.play();
		int afterAction = pet.getBoredom();

		assertEquals(beforeAction - 2, afterAction);

	}

	@Test
	public void shouldHug() {
		VirtualPet pet = new OrganicPet("Kendrick");

		int beforeAction = pet.getLoneliness();
		pet.hug();
		int afterAction = pet.getLoneliness();

		assertEquals(beforeAction - 2, afterAction);

	}

	@Test
	public void tickCheck() {
		VirtualPet underTest = new OrganicPet(null);

		int a = underTest.getBoredom();
		int b = underTest.getLoneliness();

		underTest.allTick();

		int c = underTest.getBoredom();
		int d = underTest.getLoneliness();

		assertEquals(a + 1, c);
		assertEquals(b + 1, d);

	}

}
