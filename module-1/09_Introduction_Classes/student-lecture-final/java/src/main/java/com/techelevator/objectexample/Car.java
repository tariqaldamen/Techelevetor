package com.techelevator.objectexample;

public class Car {
	
	// these are instance variable
	private String color;
	private String make;
	private String model;
	private int maxSpeed;
	private boolean hybrid;
	private int numberOfDoors;
	private boolean isStarted;
	private Engine engine;
	
	//when empty it is a default constructor
//	public Car () {
//		System.out.println("I am here");
//	}
	
	public Car (String make, String model, String name) {
		if (name.equals("Josh")) {
			System.out.println("This car is for Josh");
		}
		else {
			System.out.println("This car is for " + name);
		}
		this.make = make;
		this.model = model;
	}
	
	
	// my cool methods go here
	
	public boolean startTheCar() {
		return this.isStarted = true;
	}
	
	public boolean turnOff() {
		return this.isStarted = false;
	}
	
	
	


	/*
	 * This is a getter method
	 */
	public String getColor() {
		return color;
	}
	
	/*
	 * This is a setter method
	 */
	
	public void setColor(String color) {
		
		this.color = color;    // this sets the color passed in to the class's instance variable color
	}

	
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}	
	
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isHybrid() {
		return hybrid;
	}

	public void setHybrid(boolean hybrid) {
		this.hybrid = hybrid;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public boolean isStarted() {
		return isStarted;
	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}
	
	public String toString() {
		return "My car info: " + "\n\n"
				  + "MaxSpeed: " + this.maxSpeed + "\n"
				  + "Make: " + this.make + "\n"
				  + "Color: " + this.color + "\n"
				  + "Model: " + this.model + "\n";
		
	}
	
	
	
	
	
	
	
	
	
	

}
