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

	        assertEquals(actual, "Jeff");
	    }

	    @Test
	    public void shouldHaveDefaultHunger() {
	        VirtualPet underTest = new VirtualPet("Steve", 10, 0, 0, 0, 0);

	        int actual = underTest.getHunger();

	        assertEquals(actual, 10);
	    }
	}

