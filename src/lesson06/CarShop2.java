package lesson06;

public class CarShop2 {
	int capacity;
	Car []cars;
	
	 CarShop2(int capacity) {
		this.capacity=capacity;
		this.cars=new Car[capacity];
	}
	boolean addCar(Car car){
		//this(capacity);
		boolean b=true;
		for (int i=0;i<cars.length;i++){
			if(cars[i]==null){
				cars[i]=car;
				b=true;	
			}else{
				b=!b;	
			}
		}return b;
	}
	Car getNextCar(){
		int i;
		for( i=0;i<cars.length;i++){
			if(cars[i+1]==null){	
			}
		}
		return cars[i];	
	}
}
