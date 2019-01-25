package virtualpet;

import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class PetShelterTest {
	
	@Test
	public void shouldBeAbleToAddPet() {
		//Arrange
		PetShelter underTest = new PetShelter();
		VirtualPet pet = new VirtualPet(null, 0, 0, 0, 0, 0);
		
		//Act
		int initialPets = underTest.getShelterSize();
		underTest.addVirtualPet(pet); //Add virtual pet to PetShelter instance
		int petsAfterAddition = underTest.getShelterSize();
		
		//Assert
		Assert.assertEquals(initialPets + 1, petsAfterAddition);
	}

	
	@Test
	public void shouldRemovePet() {
		PetShelter underTest = new PetShelter();
		VirtualPet pet = new VirtualPet(null, 0, 0, 0, 0, 0);
		underTest.addVirtualPet(pet); //adding pet for testing purposes
		
		int initialPets = underTest.getShelterSize();
		underTest.removeVirtualPet(pet);
		int petsAfterRemoval = underTest.getShelterSize();
		
		Assert.assertEquals(initialPets - 1, petsAfterRemoval);
	}
	
	@Test
	public void shouldFindPet() {
		PetShelter underTest = new PetShelter();
		VirtualPet buddy = new VirtualPet("Buddy", 0, 0, 0, 0, 0);
		
		underTest.addVirtualPet(buddy);
		VirtualPet foundPet = underTest.findVirtualPet("Buddy");
		
		Assert.assertEquals("Buddy", foundPet.getName());	
	}
	
	@Test
	public void shouldFeedAllPets() {
		PetShelter underTest = new PetShelter();
		VirtualPet buddy = new VirtualPet("Buddy", 5, 0, 0, 0, 5);
		VirtualPet ralph = new VirtualPet("Ralph", 5, 0, 0, 0, 5);
		VirtualPet george = new VirtualPet("George", 5, 0, 0, 0, 5);
		 
		underTest.addVirtualPet(buddy);
		underTest.addVirtualPet(ralph);
		underTest.addVirtualPet(george);

		int beforeFeeding = buddy.getHunger() + ralph.getHunger() + george.getHunger();
		underTest.feedAllPets();
		int afterFeeding =  buddy.getHunger() + ralph.getHunger() + george.getHunger();
		
		Assert.assertEquals(beforeFeeding - 6, afterFeeding);
		
		
	}
}
