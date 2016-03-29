package lesson09;

public class Jeep extends Car{

	 public void switch4x4(){
		 changeGear(getNextGear());
		 System.out.println("switch4x4 + change gear");
	 }
	 public void driveOffRoad(){
		 System.out.println("Off Road");
	 }
	 @Override
	 void changeGear(int nextGear){
			currentGear =nextGear;
			System.out.println(nextGear+1);
		}
}
