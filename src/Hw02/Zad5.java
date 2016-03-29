package Hw02;

import java.util.Scanner;

public class Zad5 {
	
		public static void main (String[] args){
			System.out.println("Enter 2 numbers:");
			Scanner sc1=new Scanner (System.in);
			int a=sc1.nextInt();
			int b=sc1.nextInt();
			if (a<b){
			for (int i=a;i<=b;i++)
				System.out.print(i+" ");
			}else{
				for (int i=a;i>=b;i--)
					System.out.print(i+" ");
			}
		}

	}



