package lesson09.vehicle.ship;

import lesson09.vehicle.Vehicle;

public class Ship  extends Vehicle {
	boolean haveGuns;
	
public Ship(boolean haveGuns){
		super();
		this.haveGuns=haveGuns;
	}
	@Override
	public void startEngine(){
		System.out.println("The ship engine is started");
	}
	@Override
	public void stopEngine(){
		System.out.println("The ship engine is stopped");
	}
	@Override
	public void loadPassengers(){
		System.out.println("The passengers are getting in the ship.");
	}
	@Override
	public void unLoadPassengers(){
		System.out.println("The passengers are getting out of the ship.");
	}

}
