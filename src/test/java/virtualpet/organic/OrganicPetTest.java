package virtualpet.organic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import virtualpet.organic.OrganicPet;

public class OrganicPetTest {

	@Test
	public void petShouldHaveName() {
		OrganicPet underTest = new OrganicPet("Jeff");

		String actual = underTest.getName();

		assertEquals("Jeff", actual);
	}

	@Test
	public void shouldHaveDefaultHunger() {
		OrganicPet underTest = new OrganicPet("Jeff");

		int actual = underTest.getHunger();

		assertTrue(actual > 0);
	}

	@Test
	public void shouldFeed() {
		OrganicPet underTest = new OrganicPet("Jeff");

		int beforeAction = underTest.getHunger();
		underTest.feed();
		int afterAction = underTest.getHunger();

		assertEquals(beforeAction - 2, afterAction);

	}

	@Test
	public void shouldWalk() {
		OrganicPet underTest = new OrganicPet("Jeff");

		int beforeAction = underTest.getBladder();
		underTest.walk();
		int afterAction = underTest.getBladder();

		assertEquals(beforeAction - 2, afterAction);

	}

	@Test
	public void happinessCheck() {
		OrganicPet underTest = new OrganicPet("Jeff");

		int beforeAction = underTest.getHealth();

		underTest.feed();
		underTest.play();
		underTest.walk();
		underTest.hug();

		int afterAction = underTest.getHealth();

		assertEquals(beforeAction + 8, afterAction);
	}

	@Test
	public void tickCheck() {
		OrganicPet underTest = new OrganicPet(null);

		int a = underTest.getHunger();
		int b = underTest.getBoredom();
		int c = underTest.getBladder();
		int d = underTest.getLoneliness();
		int e = underTest.getHealth();

		underTest.tick(5);

		int a2 = underTest.getHunger();
		int b2 = underTest.getBoredom();
		int c2 = underTest.getBladder();
		int d2 = underTest.getLoneliness();
		int e2 = underTest.getHealth();

		assertEquals(a + 1, a2);
		assertEquals(b + 1, b2);
		assertEquals(c + 1, c2);
		assertEquals(d + 1, d2);
		assertEquals(e - 4, e2);
	}

}
