package lesson09;

public class CarsDemo {
	public static void main (String [] args){
		SportCar sc1= new SportCar();
		Jeep j1=new Jeep();
		Bus b1=new Bus();
		
		sc1.switchTurbo();
		j1.driveOffRoad();
		j1.switch4x4();
		System.out.println(b1.numberOfSeats);
		sc1.changeColor("sdasf");
		b1.changeColor("green");
		j1.changeGear(4);
		b1.changeGear(4);
	}

}
