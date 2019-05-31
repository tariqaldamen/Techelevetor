package com.techelevator2;

public class FexEd implements DeliveryDriver {
	private boolean ounces;
	private double rate = 20.00;

	FexEd(Boolean ounces) {
		this.ounces = ounces;
	}

	@Override
	public double calculateRate(int distance, double weight) {

		if (distance > 500) {
			rate = rate + 5.00;
		}
		if (ounces && weight > 48) // 48 ounces ==> 3 Pounds
		{
			rate = rate + 3.00;
		}
		if (!ounces && weight > 3) // 48 ounces ==> 3 Pounds if it's more 3 Pounds we will add 3.00
		{
			rate = rate + 3.00;
		}
		return rate;
	}

}
