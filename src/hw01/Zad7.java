package hw01;

import java.util.Scanner;

public class Zad7 {
	public static void main (String[]agrs){
		System.out.println("Enter time,money and if you are healthy:");
		Scanner sc1=new Scanner(System.in);
		int hour=sc1.nextInt();
		float money=sc1.nextFloat();
		boolean health=sc1.nextBoolean();
		{
			if (health==false){
				System.out.println(" I am NOT going out");
			 if(money!=0) {
				System.out.println("I wil buy medicine");}
			else
				System.out.println("I will be staying at home,drinking tea.");
				}
		
			
			else{
				if (money<10){
					System.out.println("I will go and have a coffee.");}
			
			}
			
			}
		
}
}

