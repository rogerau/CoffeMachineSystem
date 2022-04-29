
/*  Assignment 01: Implement a Coffee Vending Machine System
	Author: Roger Tazza
	Student Id: 300341127
	Date: January 21, 2022
	File name: CoffeeMachine class
*/
// Import the require packages for creating this application
import java.util.Scanner;

public class CoffeeMachine {

	// Define an instance of the Coffee class for every type of coffee
	// Each instance is declared as static to be usable in the whole class
	static Coffee latte = new Coffee();
	static Coffee americano = new Coffee();
	static Coffee cappucino = new Coffee();
	static Coffee caramelMacchiato = new Coffee();
	static Coffee mocha = new Coffee();

	public static void main(String[] args) {

		// Generate an instance of the Scanner class to allow read inputs from the user
		Scanner input = new Scanner(System.in);

		// Display the instructions of the program for the user
		displayInstructions();

		// Generate a loop where while the user does not confirm the order
		// the program runs again.
		String entry;
		do {
			// Clean values of the current coffee objects each time the program is run
			latte = new Coffee();
			americano = new Coffee();
			cappucino = new Coffee();
			caramelMacchiato = new Coffee();
			mocha = new Coffee();
			// Allow the user to select the coffee he/she wants to purchase:
			selectCoffee();
			// Allow the user to select the size of their coffee based on the price:
			selectCoffeeSize();
			// Ask the user if he/she wants to confirm the order
			System.out.print("Confirm your order (Y/N): ");
			// Create a inner loop to validate the user entry. Must be Y for yes or N for no
			// only
			entry = input.nextLine();
			while (entry.charAt(0) != 'Y' && entry.charAt(0) != 'N') {
				System.out.print("Please enter a valid character Y for yes or N for no. \n");
				System.out.print("Enter your answer >> ");
				entry = input.nextLine();
			}
		} while (entry.charAt(0) == 'N');

		// If the user confirm the order to the program
		// thanks for the purchase, confirm the order and get the final cost
		orderConfirmed();

	}

	// Create a method to indicate the user what he/she orders and that is ready to
	// be served based on the type of coffee and size he/she selected.
	// Also show the final cost for their order
	public static void orderConfirmed() {
		System.out.print("Thank you for your purchase!\n");
		if (latte.getName() == "Latte") {
			if (latte.getSize() == 'S') {
				System.out.print("Your Small " + latte.getName() + " is ready to serve.\n");
			} else if (latte.getSize() == 'M') {
				System.out.print("Your Medium " + latte.getName() + " is ready to serve.\n");
			} else {
				System.out.print("Your Large " + latte.getName() + " is ready to serve.\n");
			}
			// Print the total amount to paid by the customer formatted in dollar currency
			System.out.print("Total cost: $" + String.format("%.2f", latte.getFinalPrice()));
		} else if (americano.getName() == "Americano") {
			if (americano.getSize() == 'S') {
				System.out.print("Your Small " + americano.getName() + " is ready to serve.\n");
			} else if (americano.getSize() == 'M') {
				System.out.print("Your Medium " + americano.getName() + " is ready to serve.\n");
			} else {
				System.out.print("Your Large " + americano.getName() + " is ready to serve.\n");
			}
			// Print the total amount to paid by the customer formatted in dollar currency
			System.out.print("Total cost: $" + String.format("%.2f", americano.getFinalPrice()));
		} else if (cappucino.getName() == "Cappucino") {
			if (cappucino.getSize() == 'S') {
				System.out.print("Your Small " + cappucino.getName() + " is ready to serve.\n");
			} else if (cappucino.getSize() == 'M') {
				System.out.print("Your Medium " + cappucino.getName() + " is ready to serve.\n");
			} else {
				System.out.print("Your Large " + cappucino.getName() + " is ready to serve.\n");
			}
			// Print the total amount to paid by the customer formatted in dollar currency
			System.out.print("Total cost: $" + String.format("%.2f", cappucino.getFinalPrice()));
		} else if (caramelMacchiato.getName() == "Caramel Macchiato") {
			if (caramelMacchiato.getSize() == 'S') {
				System.out.print("Your Small " + caramelMacchiato.getName() + " is ready to serve.\n");
			} else if (caramelMacchiato.getSize() == 'M') {
				System.out.print("Your Medium " + caramelMacchiato.getName() + " is ready to serve.\n");
			} else {
				System.out.print("Your Large " + caramelMacchiato.getName() + " is ready to serve.\n");
			}
			// Print the total amount to paid by the customer formatted in dollar currency
			System.out.print("Total cost: $" + String.format("%.2f", caramelMacchiato.getFinalPrice()));
		} else {
			if (mocha.getSize() == 'S') {
				System.out.print("Your Small " + mocha.getName() + " is ready to serve.\n");
			} else if (mocha.getSize() == 'M') {
				System.out.print("Your Medium " + mocha.getName() + " is ready to serve.\n");
			} else {
				System.out.print("Your Large " + mocha.getName() + " is ready to serve.\n");
			}
			// Print the total amount to paid by the customer formatted in dollar currency
			System.out.print("Total cost: $" + String.format("%.2f", mocha.getFinalPrice()));
		}

	}

	// Create a method to allow the user select their coffee size showing the prices
	// for each size
	// and depending of the type of coffee selected previously
	public static void selectCoffeeSize() {

		if (latte.getName() == "Latte") {
			latte.setSmallPrice(3.7);
			latte.setMediumPrice(4.45);
			latte.setLargePrice(5);

			System.out.print(
					"Please choose the size (S/M/L): \n" + "(S)mall: $" + String.format("%.2f", latte.getSmallPrice())
							+ "" + " / (M)edium: $" + String.format("%.2f", latte.getMediumPrice()) + " / (L)arge: $"
							+ String.format("%.2f", latte.getLargePrice()) + ">> ");
		} else if (americano.getName() == "Americano") {
			americano.setSmallPrice(2.95);
			americano.setMediumPrice(3.5);
			americano.setLargePrice(4.1);

			System.out.print("Please choose the size (S/M/L): \n" + "(S)mall: $"
					+ String.format("%.2f", americano.getSmallPrice()) + "" + " / (M)edium: $"
					+ String.format("%.2f", americano.getMediumPrice()) + " / (L)arge: $"
					+ String.format("%.2f", americano.getLargePrice()) + ">> ");
		} else if (cappucino.getName() == "Cappucino") {
			cappucino.setSmallPrice(3.7);
			cappucino.setMediumPrice(4.55);
			cappucino.setLargePrice(5);

			System.out.print("Please choose the size (S/M/L): \n" + "(S)mall: $"
					+ String.format("%.2f", cappucino.getSmallPrice()) + "" + " / (M)edium: $"
					+ String.format("%.2f", cappucino.getMediumPrice()) + " / (L)arge: $"
					+ String.format("%.2f", cappucino.getLargePrice()) + ">> ");
		} else if (caramelMacchiato.getName() == "Caramel Macchiato") {
			caramelMacchiato.setSmallPrice(3.75);
			caramelMacchiato.setMediumPrice(4.50);
			caramelMacchiato.setLargePrice(5);

			System.out.print("Please choose the size (S/M/L): \n" + "(S)mall: $"
					+ String.format("%.2f", caramelMacchiato.getSmallPrice()) + "" + " / (M)edium: $"
					+ String.format("%.2f", caramelMacchiato.getMediumPrice()) + " / (L)arge: $"
					+ String.format("%.2f", caramelMacchiato.getLargePrice()) + ">> ");
		} else {
			mocha.setSmallPrice(4.5);
			mocha.setMediumPrice(5.4);
			mocha.setLargePrice(6);

			System.out.print(
					"Please choose the size (S/M/L): \n" + "(S)mall: $" + String.format("%.2f", mocha.getSmallPrice())
							+ "" + " / (M)edium: $" + String.format("%.2f", mocha.getMediumPrice()) + " / (L)arge: $"
							+ String.format("%.2f", mocha.getLargePrice()) + ">> ");
		}

		Scanner input = new Scanner(System.in);
		// Create a inner loop to validate the user entry. Must be S for small, M for
		// medium
		// and L for large only
		String entry = input.nextLine();
		while (entry.charAt(0) != 'S' && entry.charAt(0) != 'M' && entry.charAt(0) != 'L') {
			System.out.print("Please enter a valid character S, M or L. \n");
			System.out.print("Enter the size >> ");
			entry = input.nextLine();
		}

		// Once the value entered is correct, parse the value entered by the user
		// and using conditional statements assign the size of each coffee object, based on the
		// size selected previously.
		if (entry.charAt(0) == 'S') {
			latte.setSize(entry.charAt(0));
			americano.setSize(entry.charAt(0));
			cappucino.setSize(entry.charAt(0));
			caramelMacchiato.setSize(entry.charAt(0));
			mocha.setSize(entry.charAt(0));
		} else if (entry.charAt(0) == 'M') {
			latte.setSize(entry.charAt(0));
			americano.setSize(entry.charAt(0));
			cappucino.setSize(entry.charAt(0));
			caramelMacchiato.setSize(entry.charAt(0));
			mocha.setSize(entry.charAt(0));
		} else {
			latte.setSize(entry.charAt(0));
			americano.setSize(entry.charAt(0));
			cappucino.setSize(entry.charAt(0));
			caramelMacchiato.setSize(entry.charAt(0));
			mocha.setSize(entry.charAt(0));
		}

	}

	// Create a method to allow the user select the coffee he/she wants to buy
	public static void selectCoffee() {
		// Ask the user which coffee he/she wants to buy
		System.out.println(
				"Welcome to N&I Cafe\n" + "Please choose your coffee\n" + "Coffee 1: Latte\n" + "Coffee 2: Americano\n"
						+ "Coffee 3: Cappucino\n" + "Coffee 4: Caramel Macchiato\n" + "Coffee 5: Mocha");
		// Get the type of coffee based on the number entered by the user
		System.out.print("Enter the coffee number >> ");
		Scanner input = new Scanner(System.in);
		// Create a inner loop to validate the user entry. Must be a integer value from
		// 1 to 5 only
		String entry = input.nextLine();
		while (Integer.parseInt(entry) <= 0 || Integer.parseInt(entry) > 5) {
			System.out.print("Please enter a whole number from 1 to 5. \n");
			System.out.print("Enter the coffee number >> ");
			entry = input.nextLine();
		}
		// Once the value entered is correct, parse the value entered by the user
		// and using conditional statements assign the name of the coffee, based on the
		// number selected.
		if (Integer.parseInt(entry) == 1) {
			latte.setName("Latte");
		} else if (Integer.parseInt(entry) == 2) {
			americano.setName("Americano");
		} else if (Integer.parseInt(entry) == 3) {
			cappucino.setName("Cappucino");
		} else if (Integer.parseInt(entry) == 4) {
			caramelMacchiato.setName("Caramel Macchiato");
		} else {
			mocha.setName("Mocha");
		}

	}

	// Create a method to display instructions of the program
	public static void displayInstructions() {
		System.out.print("The following program allows the customer to purchase coffee at a time\n"
				+ "The program will calculate the total cost of the coffee selected by the customer\n"
				+ "based on the type of coffee selected, size and price.\n\n"
				+ "The program will require the following inputs from the customer: \n"
				+ "a. Choose which coffee he/she wants\n" + "b. Select the size of the coffee based on price\n");
	}
}
