package hw01;

import java.util.Scanner;

public class zad4 {
	public static void main (String[] args){
		System.out.println("Vavedete dve chisla:");
		Scanner scanner1=new Scanner(System.in);
		float a=scanner1.nextFloat();
		float b=scanner1.nextFloat();
		{
			if (a<b){
		System.out.println("Chislata v narastvasht red sa:" + a +","+ b);}
			else{
				if(a==b){
					System.out.println("Chislata sa ravni.");}
				else{
			System.out.println("Chislata v narastvasht red sa:" + b +","+ a);
				}
			}
	}

	}
}
