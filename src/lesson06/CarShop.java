package lesson06;

public class CarShop {
	public  static void main (String []args){
		Car bmw=new Car("BMW",true,"Black",344000,45);
		 bmw.print();
		//System.out.println(bmw.model);
		//System.out.println(bmw.color);
		 Car mercedes = new Car("Mercedes",false,"Yellow",23400,347);
		 mercedes.print();
		 Car audi=new Car();
		 audi.print();
		}
	}
