package lesson09.vehicle.ship;

public class CargoShip extends Ship {
	
public	CargoShip(boolean haveGuns){
		super(haveGuns);
	}

	@Override
	public void startEngine(){
		System.out.println("The CargoShip engine is started");
	}
	@Override
	public void stopEngine(){
		System.out.println("The CargoShip engine is stopped");
	}
	public final void loadCargo(){
		System.out.println("Loading the cargo.");
	}
	public final void unLoadCargo(){
		System.out.println("Unloading the cargo.");
	}
}
