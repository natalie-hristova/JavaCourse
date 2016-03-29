package lesson09.vehicle.car;

public class Jeep  extends Car{
	
	public Jeep (int wheels){
		super(wheels);
	}
	
	@Override
	 public void startEngine(){
		System.out.println("The jeep engine is started");
	}
	@Override
	 public void stopEngine(){
		System.out.println("The jeep engine is stopped");
	}
	 public void drive(){
		System.out.println("Driving the jeep.");
	}
	 public  final void driveOffRoad(){
		System.out.println("Driving off road.");
	}
}
