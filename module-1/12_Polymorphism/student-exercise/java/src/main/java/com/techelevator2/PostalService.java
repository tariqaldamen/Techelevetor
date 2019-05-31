package com.techelevator2;

public class PostalService implements DeliveryDriver {

	private boolean ounces;
	private int typeOfClass = 0;
	private double rate = 0.00;

	PostalService(int typeOfClass, boolean ounces) {
		this.typeOfClass = typeOfClass;
		this.ounces = ounces;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double changeToClass2 = 1;
		if (typeOfClass == 2) {
			changeToClass2 = 0.1;
		}
		if (typeOfClass == 1 || typeOfClass == 2) {
			if (ounces) {
				if (weight >= 0 && weight <= 2) {
					rate = 0.035 * changeToClass2 * distance;
				} else if (weight >= 3 && weight <= 8) {
					rate = 0.040 * changeToClass2 * distance;
				} else if (weight >= 9 && weight <= 15) {
					rate = 0.047 * changeToClass2 * distance;
				}
			} else {

				if (weight >= 1 && weight <= 3) {
					rate = 0.195 * changeToClass2 * distance;
				} else if (weight >= 4 && weight <= 8) {
					rate = 0.450 * changeToClass2 * distance;
				} else if (weight >= 9) {
					rate = 0.500 * changeToClass2 * distance;
				}

			}
		} else {

			if (ounces) {
				if (weight >= 0 && weight <= 2) {
					rate = 0.0020 * distance;
				} else if (weight >= 3 && weight <= 8) {
					rate = 0.0022 * distance;
				} else if (weight >= 9 && weight <= 15) {
					rate = 0.0024 * distance;
				}
			} else {

				if (weight >= 1 && weight <= 3) {
					rate = 0.0150 * distance;
				} else if (weight >= 4 && weight <= 8) {
					rate = 0.0160 * distance;
				} else if (weight >= 9) {
					rate = 0.0170 * distance;
				}

			}

		}

		return rate;
	}

}
