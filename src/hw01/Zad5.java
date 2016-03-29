package hw01;

import java.util.Scanner;


public class Zad5 {
	public static void main (String [] args){
		System.out.println ("Vavedete tri chisla:");
		Scanner sc1=new Scanner(System.in);
		double a=sc1.nextDouble();
		Scanner sc2=new Scanner(System.in);
		double b=sc2.nextDouble();
		Scanner sc3=new Scanner(System.in);
		double c=sc3.nextDouble();
		
		
		{
			if (a>=b){
				if (b>=c){
					System.out.println("Chislata v nizhodyashtred sa:" + a + ","+b + "," + c);}
				else{
					if (c>=a){
						System.out.println("Chislata v nizhodyashtred sa:" + c + ","+a + "," + b);}
					else {
						System.out.println("Chislata v nizhodyashtred sa:" + a + ","+c + "," + b);}
				}
			}
		
					else{
						if (c>=a)
						{
							if(c>=b)
								System.out.println("Chislata v nizhodyashtred sa:" + c + ","+b + "," + a);
							else System.out.println("Chislata v nizhodyashtred sa:" + b + ","+c + "," + a);}
						else System.out.println("Chislata v nizhodyashtred sa:" + b + ","+a + "," + c);}
							
						}
				}
			}
		