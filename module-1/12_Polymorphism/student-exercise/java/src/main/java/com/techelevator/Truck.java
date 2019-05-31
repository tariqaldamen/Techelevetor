package com.techelevator;

public class Truck implements Vehicle {

	private int numberOfAxles;

	Truck(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	@Override
	public double calculateToll(int distance) {
		double toll = 0.00;
		if (numberOfAxles == 4) {
			System.out.print("Truck (4 axels)\t");
			toll = 0.040 * distance;
		} else if (numberOfAxles == 6) {
			System.out.print("Truck (6 axels)\t");
			toll = 0.045 * distance;
		} else if (numberOfAxles >= 8) {
			System.out.print("Truck (8 axels)\t");
			toll = 0.048 * distance;
		}
		return toll;
	}

	public int getNumberOfAxles() {
		return numberOfAxles;
	}

}