package com.techelevator2;

public class SPU implements DeliveryDriver {

	private int typeOf_UPS = 0;
	private double rate = 0.00;
	private boolean ounces;

	SPU(int typeOf_UPS, boolean ounces) {
		this.typeOf_UPS = typeOf_UPS;
		this.ounces = ounces;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		if (ounces) {
			weight = weight / 16;
		}
		if (typeOf_UPS == 1) {
			rate = (weight * 0.0050) * distance;
		}
		if (typeOf_UPS == 2) {
			rate = (weight * 0.050) * distance;
		}
		if (typeOf_UPS == 3) {
			rate = (weight * 0.075) * distance;
		}
		return rate;
	}

}
