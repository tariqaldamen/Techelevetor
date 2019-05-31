package com.techelevator;

public class Car implements Vehicle {

	private boolean hasTrailer;

	Car(boolean hasTrailer) {

		this.hasTrailer = hasTrailer;
	}

	@Override
	public double calculateToll(int distance) {
		// TODO Auto-generated method stub
		double toll = 0.00;

		toll += distance * 0.020;
		if (!hasTrailer) {
			System.out.print("Car\t\t");
		}
		if (hasTrailer) {
			toll = toll + 1.00;
			System.out.print("car(with trailer)");

		}
		return toll;
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}

}
