package virtualpet.shelter;

import org.junit.Assert;
import org.junit.Test;

import virtualpet.VirtualPet;
import virtualpet.organic.OrganicDog;
import virtualpet.organic.OrganicPet;
import virtualpet.robotic.RoboticDog;
import virtualpet.robotic.RoboticPet;
import virtualpet.shelter.PetShelter;

public class PetShelterTest {

	@Test
	public void shouldBeAbleToAddPet() {
		// Arrange
		PetShelter underTest = new PetShelter();
		VirtualPet pet = new OrganicDog(null);

		// Act

		int initialPets = underTest.getShelterSize();
		underTest.addVirtualPet(pet); // Add virtual pet to PetShelter instance
		int petsAfterAddition = underTest.getShelterSize();

		// Assert
		Assert.assertEquals(initialPets + 1, petsAfterAddition);
	}

	@Test
	public void shouldBeAbleToAddOrganicPet() {
		// Arrange
		PetShelter underTest = new PetShelter();
		OrganicPet pet = new OrganicDog(null);

		// Act

		int initialPets = underTest.getShelterSize();
		underTest.addVirtualPet(pet); // Add virtual pet to PetShelter instance
		int petsAfterAddition = underTest.getShelterSize();

		// Assert
		Assert.assertEquals(initialPets + 1, petsAfterAddition);
	}

	@Test
	public void shouldBeAbleToAddRoboticPet() {
		// Arrange
		PetShelter underTest = new PetShelter();
		RoboticPet pet = new RoboticDog(null);

		// Act

		int initialPets = underTest.getShelterSize();
		underTest.addRoboticPet(pet); // Add virtual pet to PetShelter instance
		int petsAfterAddition = underTest.getShelterSize();

		// Assert
		Assert.assertEquals(initialPets + 1, petsAfterAddition);
	}

	@Test
	public void shouldRemovePet() {
		PetShelter underTest = new PetShelter();
		VirtualPet pet = new OrganicDog(null);
		underTest.addVirtualPet(pet); // adding pet for testing purposes

		int initialPets = underTest.getShelterSize();
		underTest.removeVirtualPet(pet);
		int petsAfterRemoval = underTest.getShelterSize();

		Assert.assertEquals(initialPets - 1, petsAfterRemoval);
	}

	@Test
	public void shouldFindPet() {
		PetShelter underTest = new PetShelter();

		VirtualPet buddy = new OrganicDog("Buddy");

		underTest.addVirtualPet(buddy);
		VirtualPet foundPet = underTest.findVirtualPet("Buddy");

		Assert.assertEquals("Buddy", foundPet.getName());
	}

	@Test
	public void shouldFeedAllPets() {
		PetShelter underTest = new PetShelter();
		OrganicPet buddy = new OrganicDog("Buddy");
		OrganicPet ralph = new OrganicDog("Ralph");
		RoboticPet george = new RoboticDog("George");

		underTest.addVirtualPet(buddy);
		underTest.addVirtualPet(ralph);
		underTest.addVirtualPet(george);

		int beforeFeeding = buddy.getHunger() + ralph.getHunger() + george.getBatteryLife();
		underTest.feedAllPets();
		int afterFeeding = buddy.getHunger() + ralph.getHunger() + george.getBatteryLife();

		Assert.assertEquals(beforeFeeding - 4, afterFeeding);

	}

	private void checkPetReal() {
		// TODO Auto-generated method stub

	}

	@Test
	public void shouldPlayWithAllPets() {
		PetShelter underTest = new PetShelter();
		OrganicPet buddy = new OrganicDog("Buddy");
		OrganicPet ralph = new OrganicDog("Ralph");
		RoboticPet george = new RoboticDog("George");

		underTest.addVirtualPet(buddy);
		underTest.addVirtualPet(ralph);
		underTest.addVirtualPet(george);

		int beforePlaying = buddy.getBoredom() + ralph.getBoredom() + george.getBoredom();
		underTest.playWithAllPets();
		int afterPlaying = buddy.getBoredom() + ralph.getBoredom() + george.getBoredom();

		Assert.assertEquals(beforePlaying - 6, afterPlaying);
	}

	@Test
	public void shouldWalkAllPets() {
		PetShelter underTest = new PetShelter();
		OrganicPet buddy = new OrganicDog("Buddy");
		OrganicPet ralph = new OrganicDog("Ralph");
		RoboticPet george = new RoboticDog("George");

		underTest.addVirtualPet(buddy);
		underTest.addVirtualPet(ralph);
		underTest.addVirtualPet(george);

		int beforeWalk = buddy.getBladder() + ralph.getBladder() + george.getOilGauge();
		underTest.walkAllPets();
		int afterWalk = buddy.getBladder() + ralph.getBladder() + george.getOilGauge();

		Assert.assertEquals(beforeWalk - 4, afterWalk);
	}

	@Test
	public void shouldHugAllPets() {
		PetShelter underTest = new PetShelter();
		OrganicPet buddy = new OrganicDog("Buddy");
		OrganicPet ralph = new OrganicDog("Ralph");
		RoboticPet george = new RoboticDog("George");

		underTest.addVirtualPet(buddy);
		underTest.addVirtualPet(ralph);
		underTest.addVirtualPet(george);

		int beforeHug = buddy.getLoneliness() + ralph.getLoneliness() + george.getLoneliness();
		underTest.hugAllPets();
		int afterHug = buddy.getLoneliness() + ralph.getLoneliness() + george.getLoneliness();

		Assert.assertEquals(beforeHug - 6, afterHug);
	}

	@Test
	public void shouldGetDirty() {
		PetShelter underTest = new PetShelter();
		int shelterBeforeTick = underTest.getCleanliness();
		underTest.dirtyShelter(5);
		int shelterAfterTick = underTest.getCleanliness();
		Assert.assertEquals(shelterBeforeTick - 5, shelterAfterTick);
	}

	@Test
	public void shouldGetClean() {
		PetShelter underTest = new PetShelter();
		underTest.dirtyShelter(15);
		underTest.cleanShelter();
		int shelterAfterCleaning = underTest.getCleanliness();
		Assert.assertEquals(100, shelterAfterCleaning);

	}

}
