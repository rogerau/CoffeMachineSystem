/*  Assignment 01: Implement a Coffee Vending Machine System
	Author: Roger Tazza
	Student Id: 300341127
	Date: January 21, 2022
	File name: Coffee class
*/

public class Coffee {
	// Define the data attributes or instance variables
	private String name;
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

	// Define the instance method
	public double getFinalPrice() {
		// A constant variable was defined to hold the tax amount.
		final double TAX = 0.05;
		if (name.equals("Latte")) {
			if (size == 'S') {
				return smallPrice * (1 + TAX);
			} else if (size == 'M') {
				return mediumPrice * (1 + TAX);
			} else {
				return largePrice * (1 + TAX);
			}
		} else if (name.equals("Americano")) {
			if (size == 'S') {
				return smallPrice * (1 + TAX);
			} else if (size == 'M') {
				return mediumPrice * (1 + TAX);
			} else {
				return largePrice * (1 + TAX);
			}
		} else if (name.equals("Cappucino")) {
			if (size == 'S') {
				return smallPrice * (1 + TAX);
			} else if (size == 'M') {
				return mediumPrice * (1 + TAX);
			} else {
				return largePrice * (1 + TAX);
			}
		} else if (name.equals("Caramel Macchiato")) {
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
