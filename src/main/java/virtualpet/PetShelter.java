package virtualpet;

import java.util.Collection;
import java.util.HashMap;

public class PetShelter {

	private HashMap<String, VirtualPet> virtualPets = new HashMap<String, VirtualPet>();

// Getter
	public HashMap<String, VirtualPet> getVirtualPets() {
		return virtualPets;
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
		Collection<VirtualPet> virtualPets = getVirtualPets().values();
		for (VirtualPet pet : virtualPets) {
			System.out.println(pet.getName());
		}
	}

	// Get status of all pets
	public void getShelterStatus() {
		for (VirtualPet pet : virtualPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).checkStatus();
			} else if (pet instanceof RoboticPet) {
				((RoboticPet) pet).checkPerformanceLevel();
			}
		}
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
