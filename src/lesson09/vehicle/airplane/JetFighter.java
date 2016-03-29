package lesson09.vehicle.airplane;

public class JetFighter  extends Airplane {
	int wheels;
	
	public JetFighter(int wheels,boolean haveGuns){
		super(haveGuns);
		this.wheels=wheels;
	}
		
	@Override
	public void startEngine(){
		System.out.println("The jet fighter engine is started");
	}
	public void stopEngine(){
		System.out.println("The jet fighter engine is stopped");
	}
	@Override
	public  void takeOff(){
		System.out.println("The jet fighter is taking off");
	}
	public void fire(){
		System.out.println("FIREEE....");
	}
	@Override
	public void land(){
		System.out.println("The jet fighter is landing.");
	}
	public void reloadWeapon(){
		System.out.println("Reloading the weapon at the jet fighter.");
	}
	}
