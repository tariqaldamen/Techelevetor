package com.techelevator.noisy;

import java.util.ArrayList;
import java.util.List;

public class NoiseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird b = new Bird();
		
		OneDirection one = new OneDirection();
	
		
		List<INoise> noiseList = new ArrayList<INoise>();
		noiseList.add(b);
		noiseList.add(one);
		
		for (INoise i : noiseList) {
			System.out.println(i.makeNoise());
			
		}

	}

}
