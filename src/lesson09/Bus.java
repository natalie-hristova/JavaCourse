package lesson09;

public class Bus extends Car {
	int numberOfSeats;
	String placeForLuggage;

	@Override
	void changeColor(String color) {
		color = "blue";
		System.out.println(color);
	}
}
