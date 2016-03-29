package lesson09.vehicle.airplane;

import lesson09.vehicle.Vehicle;

public class Airplane  extends Vehicle {
	boolean haveGuns;
	
	public Airplane(boolean haveGuns){
		super();
		this.haveGuns=haveGuns;
		
	}
	@Override
	public void startEngine(){
		System.out.println("The airplane engine is started");
	}
	public void stopEngine(){
		System.out.println("The airplane engine is stopped");
	}
	public  void takeOff(){
		System.out.println("The plane is taking off");
	}
	public void land(){
		System.out.println("The airplane is landing.");
	}
	@Override
	public void loadPassengers(){
		System.out.println("The passengers are getting in the airplane.");
	}
	@Override
	public void unLoadPassengers(){
		System.out.println("The passengers are getting out of the airplane.");
	}
}
