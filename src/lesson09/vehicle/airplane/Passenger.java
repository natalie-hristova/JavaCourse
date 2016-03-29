package lesson09.vehicle.airplane;

public class Passenger  extends Airplane {

	public Passenger(boolean haveGuns){
		super(haveGuns);
	}
	@Override
		public  void takeOff(){
			System.out.println("The passenger is being taken off");
		}
	}

