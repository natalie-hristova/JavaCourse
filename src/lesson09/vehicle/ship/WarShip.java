package lesson09.vehicle.ship;

public class WarShip extends Ship{
	
public	WarShip(boolean haveGuns){
		super(haveGuns);
	}
	@Override
	public void startEngine(){
		System.out.println("The war ship engine is started");
	}
	@Override
	public void stopEngine(){
		System.out.println("The war ship engine is stopped");
	}
	public void fire(){
		System.out.println("FIRE!");
	}
	public void reloadWeapon(){
		System.out.println("Reloading the weapon at the warship.");
	}
}
