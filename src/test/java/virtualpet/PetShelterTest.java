package virtualpet;

import org.junit.Assert;
import org.junit.Test;

public class PetShelterTest {

	@Test
	public void shouldBeAbleToAddPet() {
		// Arrange
		PetShelter underTest = new PetShelter();
		VirtualPet pet = new VirtualPet(null);

		// Act

		int initialPets = underTest.getShelterSize();
		underTest.addVirtualPet(pet); // Add virtual pet to PetShelter instance
		int petsAfterAddition = underTest.getShelterSize();

		// Assert
		Assert.assertEquals(initialPets + 1, petsAfterAddition);
	}

	@Test
	public void shouldRemovePet() {
		PetShelter underTest = new PetShelter();
		VirtualPet pet = new VirtualPet(null);
		underTest.addVirtualPet(pet); // adding pet for testing purposes

		int initialPets = underTest.getShelterSize();
		underTest.removeVirtualPet(pet);
		int petsAfterRemoval = underTest.getShelterSize();

		Assert.assertEquals(initialPets - 1, petsAfterRemoval);
	}

	@Test
	public void shouldFindPet() {
		PetShelter underTest = new PetShelter();

		VirtualPet buddy = new VirtualPet("Buddy");

		underTest.addVirtualPet(buddy);
		VirtualPet foundPet = underTest.findVirtualPet("Buddy");

		Assert.assertEquals("Buddy", foundPet.getName());
	}

	@Test
	public void shouldFeedAllPets() {
		PetShelter underTest = new PetShelter();

		VirtualPet buddy = new VirtualPet("Buddy");
		VirtualPet ralph = new VirtualPet("Ralph");
		VirtualPet george = new VirtualPet("George");

		underTest.addVirtualPet(buddy);
		underTest.addVirtualPet(ralph);
		underTest.addVirtualPet(george);

		int beforeFeeding = buddy.getHunger() + ralph.getHunger() + george.getHunger();
		underTest.feedAllPets();
		int afterFeeding = buddy.getHunger() + ralph.getHunger() + george.getHunger();

		Assert.assertEquals(beforeFeeding - 6, afterFeeding);

	}

	@Test
	public void shouldPlayWithAllPets() {
		PetShelter underTest = new PetShelter();
		VirtualPet buddy = new VirtualPet("Buddy");
		VirtualPet ralph = new VirtualPet("Ralph");
		VirtualPet george = new VirtualPet("George");

		underTest.addVirtualPet(buddy);
		underTest.addVirtualPet(ralph);
		underTest.addVirtualPet(george);

		int beforePlaying = buddy.getBoredom() + ralph.getBoredom() + george.getBoredom();
		underTest.playWithAllPets();
		int afterPlaying = buddy.getBoredom() + ralph.getBoredom() + george.getBoredom();

		Assert.assertEquals(beforePlaying - 6, afterPlaying);
	}

	@Test
	public void testPrint() {
		PetShelter underTest = new PetShelter();
		VirtualPet buddy = new OrganicPet("Buddy");
		VirtualPet ralph = new RoboticPet("Ralph");
		VirtualPet george = new OrganicPet("George");

		underTest.addVirtualPet(buddy);
		underTest.addVirtualPet(ralph);
		underTest.addVirtualPet(george);

		underTest.getShelterStatus();
	}

}
