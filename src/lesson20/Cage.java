package lesson20;

import java.util.List;


public class Cage <T>{
	private List<T> animals;
	
	//konstruktor s referenciq ot tipa s new
	public void add(T t){
		animals.add(t);
	}
	//
}
