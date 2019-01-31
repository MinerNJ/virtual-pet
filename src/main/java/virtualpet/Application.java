package virtualpet;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		PetShelter petShelter = new PetShelter();
		int counter = 0;
// Shelter greeting
		System.out.println("Welcome to your Virtual Pet Shelter!");
		System.out.println("There are " + petShelter.getShelterSize() + " pets in your shelter.");
// Shelter menu
		boolean repeatMainMenu = true;
		while (repeatMainMenu) {

			// TICK
			counter += 1;
			for (VirtualPet pet : petShelter.getVirtualPets().values()) {
				pet.allTick(counter);
				if (pet instanceof OrganicPet) {
					((OrganicPet) pet).tick(counter);
				} else if (pet instanceof RoboticPet) {
					((RoboticPet) pet).tick(counter);
				}
			}

			System.out.println("What would you like to do?");
			System.out.println("1. Admit new pet to the shelter");
			System.out.println("2. Adopt out a shelter pet");
			System.out.println("3. Check status of all pets");
			System.out.println("4. Perform shelter duties");
			System.out.println("5. Choose a pet to interact with");
			System.out.println("6. Save and Exit");
			System.out.println("7. Help");

			String mainMenuSelection = input.nextLine();

// User must admit at least one pet before interacting with the shelter
			if (!mainMenuSelection.equalsIgnoreCase("1") && petShelter.getShelterSize() < 1) {
				System.out.println("You need to admit a new pet to your shelter first.");
				System.out.println("What would you like to name the new pet?");

				String name = input.nextLine();

				System.out.println("Great! Now, is " + name + " a real animal, or a robot animal?");
				System.out.println("1. Real animal");
				System.out.println("2. Robotic animal");

				String petTypeSelection = input.nextLine();
				if (petTypeSelection.equals("1")) {
					OrganicPet pet = new OrganicPet(name);
					petShelter.addOrganicPet(pet);
				} else {
					RoboticPet pet = new RoboticPet(name); // Try to add "Robo" to name here
					petShelter.addRoboticPet(pet);
				}

			} else {

				switch (mainMenuSelection) {
				// Add Pet
				case "1":
					System.out.println("What would you like to name the new pet?");
					String newPetName = input.nextLine();
					if (newPetName.toLowerCase().equals("exit")) {

					} else {
						System.out.println("Great! Now, is " + newPetName + " a real animal, or a robot animal?");
						System.out.println("1. Real animal");
						System.out.println("2. Robotic animal");

						String petTypeSelection = input.nextLine();
						if (petTypeSelection.equals("1")) {
							OrganicPet pet = new OrganicPet(newPetName);
							petShelter.addOrganicPet(pet);
						} else {
							RoboticPet pet = new RoboticPet(newPetName); // Try to add "Robo" to name here
							petShelter.addRoboticPet(pet);
						}

						System.out.println("Here's your new pet, " + newPetName + "!");
						System.out.println("If you don't keep " + newPetName + " happy, " + newPetName + " will die!");
						System.out.println("Keep " + newPetName
								+ " happy by feeding it, playing with it, walking it, and hugging it.");
					}
					break;

				// Remove Pet
				case "2":
					System.out.println("Which pet is going to a new home?");
					petShelter.getPetNames();
					String petName = input.nextLine();
					if (petName.toLowerCase().equals("exit")) {
					} else {
						VirtualPet petToRemove = petShelter.findVirtualPet(petName);
						petShelter.removeVirtualPet(petToRemove);
						System.out.println("Yay! You have successfully found a new forever home for "
								+ petToRemove.getName() + "!");
					}
					break;

				// Get status of all pets
				case "3":
					System.out.println("Here are all of the pets in the shelter:");
					petShelter.getShelterStatus();
					break;

				// Interact with all pets
				case "4":
					boolean shelterMenu = true;
					while (shelterMenu) {

						// TICK
						counter += 1;
						for (VirtualPet pet : petShelter.getVirtualPets().values()) {
							pet.allTick(counter);
							if (pet instanceof OrganicPet) {
								((OrganicPet) pet).tick(counter);
							} else if (pet instanceof RoboticPet) {
								((RoboticPet) pet).tick(counter);
							}
						}

						mortalityTest(petShelter);

						System.out.println("What would you like to do?");
						System.out.println("1. Feed all of the pets.");
						System.out.println("2. Play with all of the pets.");
						System.out.println("3. Walk all of the pets.");
						System.out.println("4. Hug all of the pets.");
						System.out.println("5. Return to Main Menu");
						String shelterMenuSelection = input.nextLine();

						switch (shelterMenuSelection) {

						// Feed all pets
						case "1":
							petShelter.feedAllPets();
							System.out.println("All of the pets have been fed.");
							break;

						// Play with all pets
						case "2":
							petShelter.playWithAllPets();
							System.out.println("All of the pets got to play!");
							break;

						// Walk all of the pets
						case "3":
							petShelter.walkAllPets();
							System.out.println("All of the pets did their business.");
							break;

						// Hug all of the pets
						case "4":
							petShelter.hugAllPets();
							System.out.println("All of the pets have been hugged and feel so loved!");
							break;

						// Exit shelter menu
						case "5":
							shelterMenu = false;
							break;
						}
					}
					break;

				// Interact with one pet
				case "5":
					System.out.println("Which pet do you want to interact with?");
					petShelter.getPetNames();

					String petSelection = input.nextLine();

					VirtualPet petChoice = petShelter.findVirtualPet(petSelection);
					System.out.println(petSelection + " is so happy to see you! What do you want to do?");

					boolean petMenu = true; // organicePetMenu & roboticPetMenu
					while (petMenu) {

						// TICK
						counter += 1;
						for (VirtualPet pet : petShelter.getVirtualPets().values()) {
							pet.allTick(counter);
							if (pet instanceof OrganicPet) {
								((OrganicPet) pet).tick(counter);
							} else if (pet instanceof RoboticPet) {
								((RoboticPet) pet).tick(counter);
							}
						}

						System.out.println("1. Feed " + petChoice.getName());
						System.out.println("2. Play with " + petChoice.getName());
						System.out.println("3. Walk " + petChoice.getName());
						System.out.println("4. Hug " + petChoice.getName());
						System.out.println("You can return to the main menu at any time by typing \"Exit\"");

						String petMenuSelection = input.nextLine().toLowerCase();

						switch (petMenuSelection) {
// Feed one pet
						case "1":
							if (petChoice instanceof OrganicPet) {
								if (((OrganicPet) petChoice).getHunger() <= 0) {
									System.out.println(petChoice.getName()
											+ " says, \"No thanks, I'm full! Let's do something else.\"");
								} else {
									((OrganicPet) petChoice).feed();
									System.out.println(
											petChoice.getName() + " says \"Thanks for feeding me! What next?\"");
								}
							} else if (petChoice instanceof RoboticPet) {
								if (((RoboticPet) petChoice).getBatteryLife() <= 0) {
									System.out.println(petChoice.getName()
											+ "says, \"No thanks, I'm fully charge! Let's do something else.\"");
								} else {
									((RoboticPet) petChoice).charge();
									System.out.println(petChoice.getName() + "\"Thanks for charging me! What next?\"");
								}

							}
							break;
// Play with one pet
						case "2":
							if (petChoice.getBoredom() <= 0) {
								System.out.println(
										petChoice.getName() + " says, \"I'm tired! Let's do something else.\"");
							} else {
								petChoice.play();
								System.out.println(petChoice.getName() + " says \"I love to play! What next?\"");
							}

							break;
// Walk one pet
						case "3":
							if (petChoice instanceof OrganicPet) {
								if (((OrganicPet) petChoice).getBladder() <= 0) {
									System.out.println(
											petChoice.getName() + " says, \"Tank's tapped. Let's do something else.\"");
								} else {
									((OrganicPet) petChoice).walk();
									System.out.println(
											petChoice.getName() + " says \"Thanks for walking me! What next?\"");
								}
							} else if (petChoice instanceof RoboticPet) {
								if (((RoboticPet) petChoice).getOilGauge() <= 0) {
									System.out.println(petChoice.getName()
											+ "says, \"No thanks, Oil's clean! Let's do something else.\"");
								} else {
									((RoboticPet) petChoice).oilChange();
									System.out.println(petChoice.getName() + "\"Thanks for adding oil! What next?\"");
								}

							}

							break;
// Hug one pet							
						case "4":
							if (petChoice.getLoneliness() <= 0) {
								System.out.println(petChoice.getName()
										+ " says, \"NO MEANS NO - PLEASE STOP TOUCHING ME! Let's do something else.\"");
							} else {
								petChoice.hug();
								System.out.println(petChoice.getName() + " says \"I love you too! What next?\"");
							}

							break;
						// Return to main menu
						case "exit":
							petMenu = false;
							System.out.println(petChoice.getName() + " had a lot of fun! Bye!");
							break;
						}

						mortalityTest(petShelter);
					}
				}
			}
			mortalityTest(petShelter);
		}
	}

	public static void mortalityTest(PetShelter petShelter) {
		for (VirtualPet pet : petShelter.getVirtualPets().values()) {
			if (pet instanceof OrganicPet) {
				if (((OrganicPet) pet).getHappiness() <= 25) {
					System.out.println(((OrganicPet) pet).getName() + " has died, you monster!");
					petShelter.removeVirtualPet(pet);
				} else if (((OrganicPet) pet).getHappiness() <= 40) {
					System.out.println(((OrganicPet) pet).getName() + " is unhappy! Make sure "
							+ ((OrganicPet) pet).getName() + " doesn't die!");
				}
			}
			if (pet instanceof RoboticPet) {
				if (((RoboticPet) pet).getMaintenance() <= 0) {
					System.out.println(((RoboticPet) pet).getName() + " has shut down, you monster!");
					petShelter.removeVirtualPet(pet);
				} else if (((RoboticPet) pet).getMaintenance() <= 20) {
					System.out.println(((RoboticPet) pet).getName() + " is malfunctioning! Make sure "
							+ ((RoboticPet) pet).getName() + " doesn't shut down!");
				}
			}
		}
	}
}