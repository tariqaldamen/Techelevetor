package com.techelevator.objectexample;

import java.util.ArrayList;
import java.util.List;

public class CarApp {

	public static void main(String[] args) {
		
		
		List<Car> cars = new ArrayList<Car>();
		
		Car joshCar = new Car("Suburu", "Impressa", "Josh");
		
		joshCar.setColor("Green");
		joshCar.setHybrid(false);
		//joshCar.setMake("Suburu");
		joshCar.setMaxSpeed(150);
		joshCar.setNumberOfDoors(2);
		joshCar.setStarted(true);
		
		Engine joshEngine = new Engine();
		joshEngine.setHorsepower(400);
		joshEngine.setNumberOfCylinders(8);
		joshCar.setEngine(joshEngine);
	
		cars.add(joshCar);
	
	
		Car ashtonCar = new Car("Mazda", "300", "Ashton");
		ashtonCar.setColor("Mustard Yellow");
		ashtonCar.setHybrid(false);
		//ashtonCar.setMake("Mazda");
		ashtonCar.setMaxSpeed(300);
		ashtonCar.setNumberOfDoors(6);
		ashtonCar.setStarted(true);
		
		
		Engine ashtonEngine = new Engine();
		ashtonEngine.setHorsepower(600);
		ashtonEngine.setNumberOfCylinders(10);
		ashtonCar.setEngine(ashtonEngine);
		
		
		cars.add(ashtonCar);
		
		
	

		System.out.println("Is the car engine on? " + ashtonCar.getEngine().getEngineStatus());
		
		
		for (Car car : cars) {
			System.out.println(car.toString());
			if (car.isStarted()) {
				//turn off the car
				car.setStarted(false);
				car.getEngine().setEngineStatus("off");
			}
		}
		

		System.out.println("Is the car engine on? " + ashtonCar.getEngine().getEngineStatus());
		
		
		
		Calculator calc = new Calculator();

		

	}

}
