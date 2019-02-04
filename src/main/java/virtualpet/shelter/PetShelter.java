package virtualpet.shelter;

import java.util.Collection;
import java.util.HashMap;

import virtualpet.VirtualPet;
import virtualpet.organic.OrganicPet;
import virtualpet.robotic.RoboticPet;

public class PetShelter {

	private HashMap<String, VirtualPet> virtualPets = new HashMap<String, VirtualPet>();
	private int cleanliness = 100;

// Getters
	public HashMap<String, VirtualPet> getVirtualPets() {
		return virtualPets;
	}

	public int getCleanliness() {
		return cleanliness;
	}

// Shelter Methods
	public int getShelterSize() {
		return virtualPets.size();
	}

	public void addVirtualPet(VirtualPet pet) {
		virtualPets.put(pet.getName(), pet);
	}

	public void addOrganicPet(OrganicPet pet) {
		virtualPets.put(pet.getName(), pet);
	}

	public void addRoboticPet(RoboticPet pet) {
		virtualPets.put(pet.getName(), pet);
	}

	public void removeVirtualPet(VirtualPet pet) {
		virtualPets.remove(pet.getName(), pet);
	}

	public VirtualPet findVirtualPet(String name) {
		return virtualPets.get(name);
	}

	public void getPetNames() {
		for (VirtualPet pet : virtualPets.values()) {
			System.out.println(pet.getName());
		}
	}

	// Shelter cleanliness decreases
	public void dirtyShelter(int turnCount) {
		if (turnCount % 5 == 0)
			cleanliness -= 5;
	}

	// Clean shelter
	public void cleanShelter() {
		cleanliness = 100;
	}

	public void feedAllPets() {
		for (VirtualPet pet : virtualPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			} else if (pet instanceof RoboticPet) {
				((RoboticPet) pet).charge();
			}
		}
	}

	// boredom
	public void playWithAllPets() {
		Collection<VirtualPet> virtualPets = getVirtualPets().values();
		for (VirtualPet pet : virtualPets) {
			pet.play();
		}
	}

	// bladder
	public void walkAllPets() {
		for (VirtualPet pet : virtualPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).walk();
			} else if (pet instanceof RoboticPet) {
				((RoboticPet) pet).oilChange();
			}
		}
	}

	// pet
	public void hugAllPets() {
		Collection<VirtualPet> virtualPets = getVirtualPets().values();
		for (VirtualPet pet : virtualPets) {
			pet.hug();
		}
	}
}
