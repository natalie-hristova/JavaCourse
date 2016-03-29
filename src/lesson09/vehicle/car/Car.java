package lesson09.vehicle.car;

import lesson09.vehicle.Vehicle;

public class Car  extends Vehicle {
	int wheels;

	public Car(int wheels){
		super();
		this.wheels=wheels;
	}
	@Override
	 public void startEngine(){
		System.out.println("The car engine is started");
	}
	@Override
	 public void stopEngine(){
		System.out.println("The car engine is stopped");
	}
	 public void drive(){
		System.out.println("Driving...");
	}
	@Override
	public void loadPassengers(){
		System.out.println("The passengers are getting in the car.");
	}
	@Override
	public void unLoadPassengers(){
		System.out.println("The passengers are getting out of the car.");
	}
}
