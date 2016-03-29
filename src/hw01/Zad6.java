package hw01;

import java.util.Scanner;

public class Zad6 {
	public static void main (String[] args){
		System.out.println ("Vavedete tri chisla:");
		Scanner sc1=new Scanner(System.in);
		double a1=sc1.nextDouble();
		double a2=sc1.nextDouble();
	    double a3=sc1.nextDouble();
	   double n=a1;
	   a1=a2;
	   a2=a3;
	   a3=n;
	   System.out.println("a1="+a1+",a2="+a2+",a3="+a3);
		
		
	}
	

}
