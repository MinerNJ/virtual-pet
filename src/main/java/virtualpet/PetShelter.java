package virtualpet;

import java.util.Collection;
import java.util.HashMap;

public class PetShelter {

	private HashMap<String, VirtualPet> virtualPets = new HashMap<String, VirtualPet>();
	
	public int getShelterSize() {
		return virtualPets.size();
	}

	public void addVirtualPet(VirtualPet pet) {
		virtualPets.put(pet.getName(), pet);
	}

	public void removeVirtualPet(VirtualPet pet) {
		virtualPets.remove(pet.getName(), pet);
	}
	
	public HashMap<String, VirtualPet> getVirtualPets() {
		return virtualPets;
	}

	public VirtualPet findVirtualPet(String name) {
		return virtualPets.get(name);
	}
	
	//get status of all pets
	public void getShelterStatus() {
		Collection<VirtualPet> virtualPets = getVirtualPets().values();
		for (VirtualPet pet : virtualPets) {
			pet.checkStatus();
		}
	}
	
	public void feedAllPets() {
		Collection<VirtualPet> virtualPets = getVirtualPets().values();
		for (VirtualPet pet : virtualPets) {
			pet.feed();
		}
	}
	
	//boredom
	public void playWithAllPets() {
		Collection<VirtualPet> virtualPets = getVirtualPets().values();
		for (VirtualPet pet : virtualPets) {
			pet.play();
		}
	}
			
	//bladder
	public void walkAllPets() {
		Collection<VirtualPet> virtualPets = getVirtualPets().values();
		for (VirtualPet pet : virtualPets) {
			pet.walk();
		}
	}
	
	//pet
	public void hugAllPets() {
		Collection<VirtualPet> virtualPets = getVirtualPets().values();
		for (VirtualPet pet : virtualPets) {
			pet.hug();
		}
	}
}
		
	


