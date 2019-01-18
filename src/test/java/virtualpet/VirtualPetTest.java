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
//	 @Test
//	    public void shouldTick() {
//	        VirtualPet pet = new VirtualPet("Kendrick");
//
//	        int initialHunger = pet.getHunger();
//	        pet.tick();
//	        int hungerAfterTick = pet.getHunger();
//
//	        assertEquals(initialHunger + 10, hungerAfterTick);
//	    }
}
