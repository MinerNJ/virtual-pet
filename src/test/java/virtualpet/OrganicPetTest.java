package virtualpet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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

//	// Tick test:
//	@Test
//	public void shouldTick() {
//		OrganicPet underTest = new OrganicPet("Jeff");
//
//		int beforeAction = pet.getHunger();
//		pet.tick();
//		int afterAction = pet.getHunger();
//
//		assertEquals(beforeAction + 1, afterAction);
//	}

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

		int beforeAction = underTest.getHappiness();

		underTest.feed();
		underTest.play();
		underTest.walk();
		underTest.hug();

		int afterAction = underTest.getHappiness();

		assertEquals(beforeAction - 8, afterAction);
	}
	
	@Test
	public void tickCheck() {
		OrganicPet underTest = new OrganicPet(null);
		
		int a = underTest.getBladder();
		int b = underTest.getHunger();
		int c = underTest.getHappiness();
		
		underTest.tick(5);
		
		int d = underTest.getBladder();
		int e = underTest.getHunger();
		int f = underTest.getHappiness();
		
		assertEquals(a + 1, d);
		assertEquals(b + 1, e);
		assertEquals(c + 2, f);

	}

}
