package lesson09.vehicle.car;

public class Sport  extends Car{
	
	public Sport(int wheels){
		super(wheels);
	}
	
	@Override
	 public void startEngine(){
		System.out.println("The sport engine is started");
	}
	@Override
	 public void stopEngine(){
		System.out.println("The sport engine is stopped");
	}
	 public void drive(){
		System.out.println("Driving the sport.");
	}

}
