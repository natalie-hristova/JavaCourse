package Hw02;

import java.util.Scanner;

public class Zad10 {
	public static void main (String[] args){
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n/2,i=2,br=0;
		/*while (i<=x){
			if (n%i==0)
			System.out.println("Chisloto ne e prosto i negov delitel e:"+i);
			br++;
	        if (br==0){
				System.out.println("Chisloto e prosto");
				i++;
			}
		} */
		for(i=2;i<=x;i++)
			if (n%i==0)
				br++;
				if (br==0){
			System.out.println("Chisloto e prosto!");}
		else{
			System.out.println("Chisloto ne e prosto i ima " + br +" na broi deliteli.");
			}
		}	
	}


