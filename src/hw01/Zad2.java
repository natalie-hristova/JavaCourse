package hw01;

import java.util.Scanner;

public class Zad2 {
	public static void main (String[] args){
		System.out.println("Enter two  numbers:");
		Scanner scanner1=new Scanner(System.in); 
		double a=scanner1.nextDouble();
		double b=scanner1.nextDouble();
		//System.out.println(a+ "" +b);
		double sum=a+b;
		double razlika=a-b;
		double del,celdel;
		{
			if (a>b){
				del=a/b;
			 celdel=a%b;}
		else{
			del=b/a;
			celdel=b%a;
			
		}
		System.out.println("Sumata na dvete chisla e: " + sum);
		System.out.println("Razlikata  na dvete chisla e: " + razlika);
		System.out.println("Ostatykyt ot delenieto na chislata e:" + celdel);
		System.out.println("Chastnoto na chislata e :" + del);
		
		
		
	
	}

}
		
	} 


	
