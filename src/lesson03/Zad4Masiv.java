package lesson03;

import java.util.Scanner;

public class Zad4Masiv {
	public static void main(String[] args){
		System.out.println("Enter the length of the array:");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int array[]=new int[n];
		  for(int i=0;i<array.length;i++){
			Scanner sc2=new Scanner(System.in);
			int a=sc2.nextInt();
			array[i]=a;
		}
		 int array2[]=new int[n];
		 for (int i=0;i<array.length;i++){
			 array2[array2.length-1-i]=array[i];
		}
		 
		for (int i=0;i<array2.length;i++)
			System.out.print(array2[i] +" ");
	}
}



