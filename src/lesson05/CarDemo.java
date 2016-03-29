package lesson05;

public class CarDemo {
	public static void main(String[] args) {
		Car opel = new Car();
		opel.model = "Astra";
		opel.maxSpeed = 140.5;
		opel.currentSpeed = 55.6;
		opel.colour = "Black";
		opel.currentGear = 5;
		Person owner=new Person();
		opel.owner=owner;
		opel.owner.name = "Sashko";
		opel.owner.age=34;
		opel.owner.personalNumber=3425454;
		opel.owner.isWoman=false;
		opel.owner.weight=98;
		
		
		
		Car bmw = new Car();
		bmw.model = "B32";
		bmw.maxSpeed = 250.3;
		bmw.currentSpeed = 56;
		bmw.colour = "Dark red";
		bmw.currentGear = 3;
		Person owner2=new Person();
		bmw.owner=owner2;
		bmw.owner.name="Gergana";
		bmw.owner.age=25;
		bmw.owner.personalNumber=3902323;
		bmw.owner.isWoman=true;
		bmw.owner.weight=45;
		
		opel.accelerate();
	}

}
