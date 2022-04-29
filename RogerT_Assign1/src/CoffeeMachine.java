
/*  Assignment 01: Implement a Coffee Vending Machine System
	Author: Roger Tazza
	Student Id: 300341127
	Date: January 13, 2022
	File name: CoffeeMachine class
*/
// Import the require packages for creating this application
//import java.text.NumberFormat;
//import java.util.Locale;
import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {

		// Generate an instance of the Scanner class to allow read inputs from the user
		Scanner input = new Scanner(System.in);
		// Generate an instance of the Coffee class
		Coffee aCoffeeObj = new Coffee();

		// Display the instructions of the program for the user
		DisplayInstructions();

		// Generate a loop where while the user does not confirm the order
		// the program runs again.
		String entry;
		do {
			// Get the coffee number selected by the user:
			GetCoffeeNumber(aCoffeeObj);
			// Get the coffee size selected by the user:
			GetCoffeeSize(aCoffeeObj);
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
		// thanks for the purchase and confirm the order
		OrderConfirmed(aCoffeeObj);

//		// Create a new Locale
//		Locale usa = new Locale("en", "US");
//		
//		// Create a formatter given the Locale
//		NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);

		// Print the total amount to paid by the customer formatted in dollar currency
		System.out.print("Total cost: $" + String.format("%.2f", aCoffeeObj.GetTotalCost()));

	}

	// Create a method to indicate the user what he/she orders and that is ready to
	// be served
	// based on the coffee number and size he/she selected
	public static void OrderConfirmed(Coffee anyObj) {
		System.out.print("Thank you for your purchase!\n");
		if (anyObj.getCoffeeNumber() == 1) {
			anyObj.setName("Latte");
			if (anyObj.getSize() == 'S') {
				System.out.print("Your Small " + anyObj.getName() + " is ready to serve.\n");
			} else if (anyObj.getSize() == 'M') {
				System.out.print("Your Medium " + anyObj.getName() + " is ready to serve.\n");
			} else {
				System.out.print("Your Large " + anyObj.getName() + " is ready to serve.\n");
			}
		} else if (anyObj.getCoffeeNumber() == 2) {
			anyObj.setName("Americano");
			if (anyObj.getSize() == 'S') {
				System.out.print("Your Small " + anyObj.getName() + " is ready to serve.\n");
			} else if (anyObj.getSize() == 'M') {
				System.out.print("Your Medium " + anyObj.getName() + " is ready to serve.\n");
			} else {
				System.out.print("Your Large " + anyObj.getName() + " is ready to serve.\n");
			}
		} else if (anyObj.getCoffeeNumber() == 3) {
			anyObj.setName("Cappucino");
			if (anyObj.getSize() == 'S') {
				System.out.print("Your Small " + anyObj.getName() + " is ready to serve.\n");
			} else if (anyObj.getSize() == 'M') {
				System.out.print("Your Medium " + anyObj.getName() + " is ready to serve.\n");
			} else {
				System.out.print("Your Large " + anyObj.getName() + " is ready to serve.\n");
			}
		} else if (anyObj.getCoffeeNumber() == 4) {
			anyObj.setName("Caramel Macchiato");
			if (anyObj.getSize() == 'S') {
				System.out.print("Your Small " + anyObj.getName() + " is ready to serve.\n");
			} else if (anyObj.getSize() == 'M') {
				System.out.print("Your Medium " + anyObj.getName() + " is ready to serve.\n");
			} else {
				System.out.print("Your Large " + anyObj.getName() + " is ready to serve.\n");
			}
		} else {
			anyObj.setName("Mocha");
			if (anyObj.getSize() == 'S') {
				System.out.print("Your Small " + anyObj.getName() + " is ready to serve.\n");
			} else if (anyObj.getSize() == 'M') {
				System.out.print("Your Medium " + anyObj.getName() + " is ready to serve.\n");
			} else {
				System.out.print("Your Large " + anyObj.getName() + " is ready to serve.\n");
			}
		}

	}

	// Create a method to get coffee size showing the prices for each size
	// depending of the type of coffee selected
	public static void GetCoffeeSize(Coffee anyObj) {

		if (anyObj.getCoffeeNumber() == 1) {
			anyObj.setSmallPrice(3.7);
			anyObj.setMediumPrice(4.45);
			anyObj.setLargePrice(5);

			System.out.print(
					"Please choose the size (S/M/L): \n" + "(S)mall: $" + String.format("%.2f", anyObj.getSmallPrice())
							+ "" + " / (M)edium: $" + String.format("%.2f", anyObj.getMediumPrice()) + " / (L)arge: $"
							+ String.format("%.2f", anyObj.getLargePrice()) + ">> ");
		} else if (anyObj.getCoffeeNumber() == 2) {
			anyObj.setSmallPrice(2.95);
			anyObj.setMediumPrice(3.5);
			anyObj.setLargePrice(4.1);

			System.out.print(
					"Please choose the size (S/M/L): \n" + "(S)mall: $" + String.format("%.2f", anyObj.getSmallPrice())
							+ "" + " / (M)edium: $" + String.format("%.2f", anyObj.getMediumPrice()) + " / (L)arge: $"
							+ String.format("%.2f", anyObj.getLargePrice()) + ">> ");
		} else if (anyObj.getCoffeeNumber() == 3) {
			anyObj.setSmallPrice(3.7);
			anyObj.setMediumPrice(4.55);
			anyObj.setLargePrice(5);

			System.out.print(
					"Please choose the size (S/M/L): \n" + "(S)mall: $" + String.format("%.2f", anyObj.getSmallPrice())
							+ "" + " / (M)edium: $" + String.format("%.2f", anyObj.getMediumPrice()) + " / (L)arge: $"
							+ String.format("%.2f", anyObj.getLargePrice()) + ">> ");
		} else if (anyObj.getCoffeeNumber() == 4) {
			anyObj.setSmallPrice(3.75);
			anyObj.setMediumPrice(4.50);
			anyObj.setLargePrice(5);

			System.out.print(
					"Please choose the size (S/M/L): \n" + "(S)mall: $" + String.format("%.2f", anyObj.getSmallPrice())
							+ "" + " / (M)edium: $" + String.format("%.2f", anyObj.getMediumPrice()) + " / (L)arge: $"
							+ String.format("%.2f", anyObj.getLargePrice()) + ">> ");
		} else {
			anyObj.setSmallPrice(4.5);
			anyObj.setMediumPrice(5.4);
			anyObj.setLargePrice(6);

			System.out.print(
					"Please choose the size (S/M/L): \n" + "(S)mall: $" + String.format("%.2f", anyObj.getSmallPrice())
							+ "" + " / (M)edium: $" + String.format("%.2f", anyObj.getMediumPrice()) + " / (L)arge: $"
							+ String.format("%.2f", anyObj.getLargePrice()) + ">> ");
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
		// and assign it to the coffee size characteristic.
		anyObj.setSize(entry.charAt(0));
	}

	// Create a method to get coffee number selected by the user
	public static void GetCoffeeNumber(Coffee anyObj) {

		System.out.println(
				"Welcome to N&I Cafe\n" + "Please choose your coffee\n" + "Coffee 1: Latte\n" + "Coffee 2: Americano\n"
						+ "Coffee 3: Cappucino\n" + "Coffee 4: Caramel Macchiato\n" + "Coffee 5: Mocha");
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
		// and assign it to the coffee number characteristic.
		anyObj.setCoffeeNumber(Integer.parseInt(entry));
	}

	// Create a method to display instructions of the program
	public static void DisplayInstructions() {
		System.out.print("The following program allows the customer to purchase coffee at a time\n"
				+ "The program will calculate the total cost of the coffe selected by the customer\n"
				+ "based on the type of coffee selected, size and price.\n\n"
				+ "The program will require the following inputs from the customer: \n"
				+ "a. Choose which coffee he/she wants\n" + "b. Select the size of the coffee based on price\n");
	}
}