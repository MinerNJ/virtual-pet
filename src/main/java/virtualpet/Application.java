package virtualpet;

import java.util.Collection;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		PetShelter petShelter = new PetShelter();

		System.out.println("Welcome to your Virtual Pet Shelter!");
		System.out.println("There are " + petShelter.getShelterSize() + " pets in your shelter.");
		boolean repeatMainMenu = true;
		while (repeatMainMenu) {
			System.out.println("What would you like to do?");
			System.out.println("1. Admit new pet");
			System.out.println("2. Adopt out new pet");
			System.out.println("3. Check status of all pets");
			System.out.println("4. Perform shelter duties");
			System.out.println("5. Choose a pet to interact with");
			System.out.println("6. Save and Exit");
			System.out.println("7. Help");

			String mainMenuSelection = input.nextLine();
			// User must admit at least one pet before interacting with the shelter:
			if (petShelter.getShelterSize() < 1) {
				System.out.println("You need to admit a new pet to your shelter first.");
				System.out.println("What would you like to name the new pet?");
				String name = input.nextLine();
				VirtualPet pet = new VirtualPet(name, 5, 8, 3, 8, 24);
				petShelter.addVirtualPet(pet);
				System.out.println("Here's your new pet, " + pet.getName() + "!");
				System.out.println("If you don't keep " + pet.getName() + " happy," + pet.getName() + " will die!");
				System.out.println(
						"Keep " + pet.getName() + " happy by feeding it, playing with it, walking it, and hugging it.");
				// Once one pet is created, main menu loop restarts:
			} else {

				switch (mainMenuSelection) {
				// Add Pet
				case "1":
					System.out.println("What would you like to name the new pet?");
					String name = input.nextLine();
					VirtualPet pet = new VirtualPet(name, 5, 8, 3, 8, 24);
					petShelter.addVirtualPet(pet);
					System.out.println("Here's your new pet, " + pet.getName() + "!");
					System.out
							.println("If you don't keep " + pet.getName() + " happy, " + pet.getName() + " will die!");
					System.out.println("Keep " + pet.getName()
							+ " happy by feeding it, playing with it, walking it, and hugging it.");
					break;
				// Remove Pet
				case "2":
					System.out.println("Which pet is going to a new home?");
					petShelter.getPetNames();
					String toBeRemoved = input.nextLine().toLowerCase();
					petShelter.removeVirtualPet(petShelter.findVirtualPet(toBeRemoved));
					System.out.println(toBeRemoved + "has been removed!");

					break;

				// Interact with one pet
				case "5":
					System.out.println("Which pet do you want to interact with?");
					petShelter.getPetNames();

					String petSelection = input.nextLine();

					VirtualPet petChoice = petShelter.findVirtualPet(petSelection);
					System.out.println(petSelection + " is so happy to see you! What do you want to do?");

					boolean petMenu = true;
					while (petMenu) {
						System.out.println("1. Feed " + petChoice.getName());
						System.out.println("2. Play with " + petChoice.getName());
						System.out.println("3. Walk " + petChoice.getName());
						System.out.println("4. Hug " + petChoice.getName());
						System.out.println("You can return to the main menu at any time by typing \"Exit\"");

						String petMenuSelection = input.nextLine().toLowerCase();

						switch (petMenuSelection) {

						case "1":
							if (petChoice.getHunger() <= 0) {
								System.out.println(petChoice.getName()
										+ " says, \"No thanks, I'm full! Let's do something else.\"");
							} else {
								petChoice.feed();
								System.out.println(petChoice.getName() + " says \"Thanks for feeding me! What next?\"");
							}

							break;

						case "2":
							if (petChoice.getBoredom() <= 0) {
								System.out.println(
										petChoice.getName() + " says, \"I'm tired! Let's do something else.\"");
							} else {
								petChoice.play();
								System.out.println(petChoice.getName() + " says \"I love to play! What next?\"");
							}

							break;

						case "3":
							if (petChoice.getBladder() <= 0) {
								System.out.println(
										petChoice.getName() + " says, \"Tank's tapped. Let's do something else.\"");
							} else {
								petChoice.walk();
								System.out.println(
										petChoice.getName() + " says \"Oh boy, walks are my favorite! What next?\"");
							}
							
							break;
							
						case "4":
							if (petChoice.getLoneliness() <= 0) {
								System.out.println(petChoice.getName()
										+ " says, \"NO MEANS NO - PLEASE STOP TOUCHING ME! Let's do something else.\"");
							} else {
								petChoice.hug();
								System.out.println(petChoice.getName() + " says \"I love you too! What next?\"");
							}
							
							break;
							
						case "exit":
							petMenu = false;
							System.out.println(petChoice.getName() + " had a lot of fun! Bye!");
							break;
	
						} 
						if(petChoice.getHappiness() > 32) {
							petMenu = false;
							petShelter.removeVirtualPet(petChoice);
							System.out.println("You have mistreated " + petChoice.getName() + ", you monster." 
							+ petChoice.getName() + " has died.");
						}
					}
				}
			}
		}
	}
}
//
//					boolean repeatMenu = true;
//					while (repeatMenu) {
//						pet.tick();
//						if (pet.getHappiness() >= 32) {
//							
//							System.exit(0); // Need a way to get it back to the initial menu
//							repeatMenu = false;
//						} else {
//							System.out.println("1. Feed " + pet.getName());
//							System.out.println("2. Play with " + pet.getName());
//							System.out.println("3. Walk " + pet.getName());
//							System.out.println("4. Hug " + pet.getName());
//							System.out.println("You can Save and Exit at any time by saying \"Exit\"");
//
//							String menuSelection = input.nextLine();
//
//							if (menuSelection.toLowerCase().equals("exit")) {
//								System.out.println("Are you sure you want to exit?");
//								System.out.println("1. Yes");
//								System.out.println("2. No");
//								String exitAnswer = input.nextLine();
//								if (exitAnswer.toLowerCase().equals("yes") || exitAnswer.toLowerCase().equals("1")) {
//									System.exit(0);
//									repeatMenu = false;
//								} else if (exitAnswer.toLowerCase().equals("no")
//										|| exitAnswer.toLowerCase().equals("2")) {
//									System.out.println("What would you like to do?");
//									repeatMenu = true;
//								}
//
//							} else if (
//							
//							
//							} else if (menuSelection.toLowerCase().equals("hug")
//									|| menuSelection.toLowerCase().equals("4")) {
//								
//							} else {
//								System.out.println("Please make a valid menu selection:");
//							}
//
//						}
