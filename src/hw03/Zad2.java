package hw03;

import java.util.Scanner;

public class Zad2 {
public static void main(String[]args){
	System.out.println("Enter an even number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int mas[]=new int[n];
	for (int i=0;i<mas.length/2;i++){
		System.out.println("Enter the element numer" +(i+1));
		Scanner sc2=new Scanner(System.in);
		int nmas=sc2.nextInt();
		mas[i]=nmas;
	}
		for (int i=0;i<mas.length/2;i++){
		
		mas[n/2+i]=mas[i];}
		for (int i=0;i<mas.length;i++)
		System.out.print(mas[i] +" ");
}
}
