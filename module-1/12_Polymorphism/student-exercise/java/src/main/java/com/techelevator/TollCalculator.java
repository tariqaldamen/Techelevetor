package com.techelevator;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TollCalculator {

	public static void main(String[] args) {

		Vehicle car = new Car(false);
		Vehicle carWithTrailer = new Car(true);
		Vehicle tank = new Tank();
		Vehicle truck_4_Axels = new Truck(4);
		Vehicle truck_6_Axels = new Truck(6);
		Vehicle truck_8_Axels = new Truck(8);

		List<Vehicle> vehicle = new ArrayList<Vehicle>();
		vehicle.add(car);
		vehicle.add(carWithTrailer);
		vehicle.add(tank);
		vehicle.add(truck_4_Axels);
		vehicle.add(truck_6_Axels);
		vehicle.add(truck_8_Axels);
		System.out.printf("%-20s %28s %34s %n", "Vehicle", "Distance Traveled", "Toll $");
		System.out.println("------------------------------------------------------------------------------------");
		Random rand = new Random();
		for (Vehicle vehicles : vehicle) {
			int randNumbers = rand.nextInt(240) + 10;

			System.out.printf("\t\t\t%-25s \t %10.2f  %n", randNumbers, vehicles.calculateToll(randNumbers));
		}

	}

}
