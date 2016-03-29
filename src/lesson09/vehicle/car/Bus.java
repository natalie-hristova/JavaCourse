package lesson09.vehicle.car;

public class Bus  extends Car{

	public Bus(int wheels){
		super( wheels);
	}
	@Override
	 public void startEngine(){
		System.out.println("The bus engine is started");
	}
	@Override
	 public void stopEngine(){
		System.out.println("The bus engine is stopped");
	}
	@Override
	 public void drive(){
		System.out.println("Driving the bus.");
	}
	@Override
	public void loadPassengers(){
		System.out.println("The passengers are getting in the bus.");
	}
	@Override
	public void unLoadPassengers(){
		System.out.println("The passengers are getting out of the bus.");
	}
}
