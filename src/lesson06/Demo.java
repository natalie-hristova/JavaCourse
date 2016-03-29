package lesson06;

public class Demo {
	public static void main(String[] args){
	Car lada=new Car("Lada",true,"Black",74,3400.99);
	Car c2=new Car("car",false,"red",34,3434);
	Person p1=new Person("polina",94023435,false,45,34000);
	Person p2=new Person("Vergy",935345,false,12,234);
	Person p3=new Person ("Blago",924345,true,7,3434);
	/*p1.getFriend();
	p1.print();
	p2.print();
	p3.print();
	lada.print();
	c2.isMoreExpensive(lada);*/
	
	p1.buyCar(lada);
	p2.buyCar(lada);
	p3.buyCar(c2);
	p1.sellCarForScrap(lada);
	}
}
