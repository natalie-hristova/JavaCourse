package lesson09.vehicle;

public class Vehicle {
	String model ;
	double speed;
	int doors;
	String fuel;
	double cargoSpace;
	int seats;

	public  Vehicle(){
		
	}
	public void startEngine(){
		System.out.println("The engine is started");
	}
	public void stopEngine(){
		System.out.println("The engine is stopped");
	}
	public void loadPassengers(){
		System.out.println("The passengers are getting in the vehicle.");
	}
	public void unLoadPassengers(){
		System.out.println("The passengers are getting out of the vehicle.");
	}
}
