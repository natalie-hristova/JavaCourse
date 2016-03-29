package lesson09.vehicle.car;

public class Truck  extends Car {
	
	public Truck(int wheels){
		super(wheels);
	}
	@Override
	 public void startEngine(){
		System.out.println("The truck engine is started");
	}
	@Override
	 public void stopEngine(){
		System.out.println("The truck engine is stopped");
	}
	 public void drive(){
		System.out.println("Driving the truck.");
	}
}
