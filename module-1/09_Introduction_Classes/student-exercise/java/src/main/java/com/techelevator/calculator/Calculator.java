package com.techelevator.calculator;

public class Calculator {

	private int currentValue;

	public int add(int addend) {
		
		currentValue = currentValue + addend;
		return currentValue;
	}

	public int multiply(int multiplier) {
		
		currentValue = currentValue * multiplier;
		return currentValue;
	}

	public int subtract(int subtrahend) {

		currentValue = currentValue - subtrahend;
		return currentValue;
	}

	public int power(int exponent) {

		currentValue = (int) Math.pow(currentValue, exponent);
		return currentValue;
	}

	public void reset() {

		currentValue = 0;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
}
