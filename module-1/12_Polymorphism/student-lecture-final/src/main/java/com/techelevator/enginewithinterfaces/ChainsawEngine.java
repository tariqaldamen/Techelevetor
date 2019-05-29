package com.techelevator.enginewithinterfaces;

public class ChainsawEngine implements Engine{
	
	private boolean isStarted;
	
	public boolean stop() {
		return isStarted = false;
	}

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return isStarted = true;
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("RRRRRRR");
		
	}
	
	

}
