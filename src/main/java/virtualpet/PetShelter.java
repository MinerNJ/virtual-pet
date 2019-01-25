package virtualpet;

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
}
		
	


