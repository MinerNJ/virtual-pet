package virtualpet;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Virtual Pet Shelter!");
		System.out.println("What would you like to name your pet?");

		String name = input.nextLine();
		VirtualPet pet = new VirtualPet(name, 5, 8, 3, 8, 24);

		System.out.println("Here's your new pet, " + pet.getName() + "!");
		System.out.println(
				"If you don't keep " + pet.getName() + " happy the shelter will take " + pet.getName() + " back!");
		System.out.println("Keep " + pet.getName() + " happy by doing the following things:");
		boolean repeatMenu = true;
		while (repeatMenu) {
			System.out.println("1. Feed " + pet.getName());
			System.out.println("2. Play with " + pet.getName());
			System.out.println("3. Walk " + pet.getName());
			System.out.println("4. Hug " + pet.getName());
			System.out.println("You can Save and Exit at any time by saying \"Exit\"");

			String menuSelection = input.nextLine();

			if (menuSelection.toLowerCase().equals("exit")) {
				System.out.println("Are you sure you want to exit?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				String exitAnswer = input.nextLine();
				if (exitAnswer.toLowerCase().equals("yes") || exitAnswer.toLowerCase().equals("1")) {
					System.exit(0);
					repeatMenu = false;
				} else if (exitAnswer.toLowerCase().equals("no") || exitAnswer.toLowerCase().equals("2")) {
					System.out.println("What would you like to do?");
					repeatMenu = true;
				}

			} else if (menuSelection.toLowerCase().equals("feed") || menuSelection.toLowerCase().equals("1")) {
				if (pet.getHunger() <= 0) {
					System.out.println(pet.getName() + " says, \"No thanks, I'm full! Let's do something else.\"");
				} else {
					pet.feed();
					System.out.println(pet.getName() + " says \"Thanks for feeding me! What next?\"");
				}
			} else if (menuSelection.toLowerCase().equals("play with") || menuSelection.toLowerCase().equals("2")) {
				if (pet.getBoredom() <= 0) {
					System.out.println(pet.getName() + " says, \"I'm tired! Let's do something else.\"");
				} else {
					pet.play();
					System.out.println(pet.getName() + " says \"I love to play! What next?\"");
				}
			} else if (menuSelection.toLowerCase().equals("walk") || menuSelection.toLowerCase().equals("3")) {
				if (pet.getBoredom() <= 0) {
					System.out.println(pet.getName() + " says, \"Tank's tapped. Let's do something else.\"");
				} else {
					pet.walk();
					System.out.println(pet.getName() + " says \"Oh boy, walks are my favorite! What next?\"");
				}
			} else if (menuSelection.toLowerCase().equals("hug") || menuSelection.toLowerCase().equals("4")) {
				if (pet.getBoredom() <= 0) {
					System.out.println(pet.getName()
							+ " says, \"NO MEANS NO - PLEASE STOP TOUCHING ME! Let's do something else.\"");
				} else {
					pet.hug();
					System.out.println(pet.getName() + " says \"I love you too! What next?\"");
				}
			} else {
				System.out.println("Please make a valid menu selection:");
			}

		}
	}

}
