package lesson06;

public class Car {
	String model;
	double maxSpeed;
	double currentSpeed;
	String color;
	int currentGear;
	double price;
	boolean isSportCar;
	Car test;
	Person owner;
	
	Car(){
		System.out.println("Deafault");
		
	}
	Car(String text){
		this();
		//System.out.println(this);
	}
	Car(String model,boolean isSportCar,String color,double maxSpeed){
		this(model);
		//test=this;
	
		this.model=model;
		this.isSportCar=isSportCar;
		this.color=color;
		this.maxSpeed=maxSpeed;
		
		currentGear=1;
		currentSpeed=10;
		
	}
	Car(String model,boolean isSportCar,String color,double maxSpeed,double price){
		this( model, isSportCar, color,maxSpeed);
		this.price=price;
		if(maxSpeed<200 || isSportCar){
		this.maxSpeed=maxSpeed;
		}else{
			//this.maxSpeed=0;
			System.out.println("The speed is too big");
		}
	}
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
		color=newColour;
	}
	void print(){
	System.out.println(model);
	System.out.println(color);
	System.out.println(maxSpeed);
}
	void changeOwner (Person newOwner){
		owner=newOwner;
	}
	boolean isMoreExpensive(Car car){
		boolean b =this.price > car.price;
		
	System.out.println(b);
	return (b);
	}
		double calculateCarPriceForScrap(double metalPrice){
		 double coef=0.2;
		 if (this.color.equals("Black") ||this.color.equals("White")){
			 coef+=0.05;
		 }
		 if(isSportCar){
			 coef+=0.05;
		 }
		 System.out.println(metalPrice * coef);
		return metalPrice * coef;
		 
	
		
	}
}
