package com.techelevator;

public class Elevator {

	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;

	public Elevator(int totalNumberOffloors) {
		numberOfFloors = totalNumberOffloors;
		currentFloor = 1;
	}

	public void openDoor() {
		doorOpen = true;
	}

	public void closeDoor() {
		doorOpen = false;
	}

	public void goUp(int desiredFloor) {
		if (!doorOpen && (desiredFloor <= numberOfFloors) && (currentFloor < desiredFloor)) {
			currentFloor = desiredFloor;
		}
	}

	public void goDown(int desiredFloor) {
		if (!doorOpen && (desiredFloor >= 1) && (currentFloor > desiredFloor)) {
			currentFloor = desiredFloor;
		}
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

}
