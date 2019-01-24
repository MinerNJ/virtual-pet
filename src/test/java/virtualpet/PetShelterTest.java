package virtualpet;

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
	public void shouldBeAbleToRemovePet() {
		//Arrange
		PetShelter underTest = new PetShelter();
		VirtualPet pet = new VirtualPet(null, 0, 0, 0, 0, 0);
		underTest.addVirtualPet(pet); //adding pet for testing purposes
		
		//Act
		int initialPets = underTest.getShelterSize();
		underTest.removeVirtualPet(pet); 
		int petsAfterRemoval = underTest.getShelterSize();
		
		//Assert
		Assert.assertEquals(initialPets - 1, petsAfterRemoval);
	}
	
}
