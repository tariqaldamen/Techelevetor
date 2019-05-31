package com.techelevator2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class PostageCalculator {

	public static void main(String[] args) {

		Boolean PoundsOunces = false;
		Scanner enter = new Scanner(System.in);

		System.out.print("Please enter the weight of the package? ");
		double enterTheWeight = Double.parseDouble(enter.nextLine());
		System.out.print("(P)ounds or (O)unces? ");
		String enterPoundsOunces = enter.nextLine();
		System.out.print("What distance will it be traveling? ");
		int enterTheDistance = Integer.parseInt(enter.nextLine());

		if (enterPoundsOunces.equals("P") || enterPoundsOunces.equals("p")) {
			PoundsOunces = false;
		}
		if (enterPoundsOunces.equals("o") || enterPoundsOunces.equals("O")) {
			PoundsOunces = true;
		}

		List<DeliveryDriver> deliveryDriver = new ArrayList<DeliveryDriver>();

		DeliveryDriver postalServiceClass1 = new PostalService(1, PoundsOunces);
		DeliveryDriver postalServiceClass2 = new PostalService(2, PoundsOunces);
		DeliveryDriver postalServiceClass3 = new PostalService(3, PoundsOunces);

		deliveryDriver.add(postalServiceClass1);
		deliveryDriver.add(postalServiceClass2);
		deliveryDriver.add(postalServiceClass3);

		DeliveryDriver fexEd = new FexEd(PoundsOunces);

		deliveryDriver.add(fexEd);

		DeliveryDriver sPU_4Day = new SPU(1, PoundsOunces);
		DeliveryDriver sPU_2Day = new SPU(2, PoundsOunces);
		DeliveryDriver nextDay = new SPU(3, PoundsOunces);

		deliveryDriver.add(sPU_4Day);
		deliveryDriver.add(sPU_2Day);
		deliveryDriver.add(nextDay);

		String[] postageCalculatorNames = new String[] { "Postal Service (1st Class)", "Postal Service (2nd Class)",
				"Postal Service (3rd Class)", "FexEd", "SPU (4-Day Ground)", "SPU (2-Day Business)", "SPU (Next Day)" };

		System.out.println("\n");

		System.out.printf("%-20s  %25s %n", "Delivery Method", "$ cost");
		System.out.println("------------------------------------------------");
		int i = 0;
		for (DeliveryDriver printcalculateRate : deliveryDriver) {

			System.out.printf("%-40s  $%-30.2f %n", postageCalculatorNames[i],
					printcalculateRate.calculateRate(enterTheDistance, enterTheWeight));

			if (i <= 5) {
				i++;
			}
		}

	}

}
