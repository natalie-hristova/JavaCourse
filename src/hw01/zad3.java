package hw01;

import java.util.Scanner;

public class zad3 {
	public static void main (String[] args){
		System.out.println("Enter 2 numbers:");
		Scanner scanner1=new Scanner(System.in);
		double a=scanner1.nextDouble();
		double b= scanner1.nextDouble();
		double n=b;
		b=a;
		a=n;
		System.out.println("Chislata v obraten red sa:" + a  +"," + b);
	}

}
