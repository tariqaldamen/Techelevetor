package com.techelevator.farm;

public class Cow extends FarmAnimal {

	public Cow() {
		super("Cow", "moo!");
	}
	
	public String makeSound() {
		return "moo";
	}

}