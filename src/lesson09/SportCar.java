package lesson09;

public class SportCar extends Car{
	boolean isCabriolet;
	double price;
	
	void switchTurbo(){
		changeGearDown();
		System.out.println("Turbo + gear down");
	}
	@Override
	void changeColor(String color){
		color="Red";
		System.out.println(color);
	}
}
