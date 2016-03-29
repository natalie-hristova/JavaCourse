package lesson05;

public class Car {
	String model;
	double maxSpeed;
	double currentSpeed;
	String colour;
	int currentGear;
	Person owner;
	
	void accelerate (){
		currentSpeed ++;
		System.out.println(currentSpeed);
	}
	void changeGearUp(){
		if (currentGear<5){
			currentGear ++;
		}
	}
	void changeGearDown(){
		if(currentGear>0){
			currentGear --;
		}
    }
	void changeGear(int nextGear){
		currentGear = (nextGear<=5 && nextGear>=1) ? nextGear : currentGear;
	}
	void changeColor(String newColour){
		colour=newColour;
	}
}
