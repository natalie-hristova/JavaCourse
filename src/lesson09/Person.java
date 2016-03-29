package lesson09;

public class Person {
	String name;
	int age;
	long personalNumber;
	boolean isMale;
	double weight;
	Person mother;
	double money;
	Car car;
	Person []friend=new Person[3];
	
	
	
	Person(){
		this.age=0;
		this.weight=4;
	}
	Person (String name,long personalNumber,boolean isMale,int personNum,double money){
		this();
		this.name=name;
		this.personalNumber=personalNumber;
		this.isMale=isMale;
		this.friend=new Person[personNum];
		this. money=money;
	}
	void buyCar(Car car){
		this.car=car;
		if(this.money>=car.price){
			this.money=money-car.price;
			System.out.println("The money is enough.The left is "+money);
		}else{
			System.out.println("Not enough "+money);	
		}
	
	}
	double sellCarForScrap(Car car){
		this.money+=car.price;
		double m=this.money;
		System.out.println ("The sum after selling the car for scrab is "+m);
	return m;
	}
		void getFriend(){
			
			System.out.println("the person has "+friend.length+" friends.");
		}
		void print(){
			System.out.println(name);
			System.out.println(personalNumber);
			System.out.println(isMale);
			
		}
		
}

