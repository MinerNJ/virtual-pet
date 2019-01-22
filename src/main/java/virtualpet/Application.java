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
		boolean repeatMenu = true;
		while (repeatMenu) {
			System.out.println("Keep " + pet.getName() + " happy by doing the following things:");
			System.out.println("1. Feed " + pet.getName());
			System.out.println("2. Play with " + pet.getName());
			System.out.println("3. Walk " + pet.getName());
			System.out.println("4. Hug " + pet.getName());
			System.out.println("If you don't do these things enough the shelter will take " + pet.getName() + " back!");
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
					repeatMenu = true;
				}
				
			} else if (menuSelection.toLowerCase().equals("feed") || menuSelection.toLowerCase().equals("1")) {
				pet.feed();
			} else if (menuSelection.toLowerCase().equals("play with") || menuSelection.toLowerCase().equals("2")) {
				pet.play();
			} else if (menuSelection.toLowerCase().equals("walk") || menuSelection.toLowerCase().equals("3")) {
				pet.walk();
			} else if (menuSelection.toLowerCase().equals("hug") || menuSelection.toLowerCase().equals("4")) {
				pet.hug();
			}

		}
	}
}
