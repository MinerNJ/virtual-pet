package virtualpet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {


	    @Test
	    public void shouldBeAbleToCreatePet() {
	        VirtualPet pet = new VirtualPet();
	    }

	    @Test
	    public void petShouldHaveName() {
	        VirtualPet underTest = new VirtualPet("Jeff");

	        String expected = underTest.getName();

	        assertEquals(expected, "Jeff");
	    }

	    @Test
	    public void shouldHaveDefaultHunger() {
	        VirtualPet underTest = new VirtualPet("Steve");

	        int expected = underTest.getHunger;

	        assertEquals(expected, 10);
	    }
	}
}
