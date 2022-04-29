/*  Assignment 01: Implement a Coffee Vending Machine System
	Author: Roger Tazza
	Student Id: 300341127
	Date: January 13, 2022
	File name: Coffee class
*/


public class Coffee {
	
	// Define the data attributes or instance variables
	// A coffee number and size attributes were defined additionally.
	private String name;
	private int coffeeNumber;
	private char size;
	private double largePrice;
	private double mediumPrice;
	private double smallPrice;

	// Define the setter and getter methods for each property
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoffeeNumber() {
		return coffeeNumber;
	}

	public void setCoffeeNumber(int coffeeNumber) {
		this.coffeeNumber = coffeeNumber;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public double getLargePrice() {
		return largePrice;
	}

	public void setLargePrice(double largePrice) {
		this.largePrice = largePrice;
	}

	public double getMediumPrice() {
		return mediumPrice;
	}

	public void setMediumPrice(double mediumPrice) {
		this.mediumPrice = mediumPrice;
	}

	public double getSmallPrice() {
		return smallPrice;
	}

	public void setSmallPrice(double smallPrice) {
		this.smallPrice = smallPrice;
	}

	// Define the instance methods
	public double GetTotalCost() {
		// A constant variable was defined to hold the tax amount.
		final double TAX = 0.05;
		if (coffeeNumber == 1) {
			if (size == 'S') {
				return smallPrice * (1 + TAX);
			} else if (size == 'M') {
				return mediumPrice * (1 + TAX);
			} else {
				return largePrice * (1 + TAX);
			}
		} else if (coffeeNumber == 2) {
			if (size == 'S') {
				return smallPrice * (1 + TAX);
			} else if (size == 'M') {
				return mediumPrice * (1 + TAX);
			} else {
				return largePrice * (1 + TAX);
			}
		} else if (coffeeNumber == 3) {
			if (size == 'S') {
				return smallPrice * (1 + TAX);
			} else if (size == 'M') {
				return mediumPrice * (1 + TAX);
			} else {
				return largePrice * (1 + TAX);
			}
		} else if (coffeeNumber == 4) {
			if (size == 'S') {
				return smallPrice * (1 + TAX);
			} else if (size == 'M') {
				return mediumPrice * (1 + TAX);
			} else {
				return largePrice * (1 + TAX);
			}
		} else {
			if (size == 'S') {
				return smallPrice * (1 + TAX);
			} else if (size == 'M') {
				return mediumPrice * (1 + TAX);
			} else {
				return largePrice * (1 + TAX);
			}
		}
	}

}



